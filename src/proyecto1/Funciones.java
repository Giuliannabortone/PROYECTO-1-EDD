/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author giubo
 */

public class Funciones {
    
    public String  users [][];
    public String relation [][];
    boolean Usuarios;
    
    /*CONSTRUCTOR*/
    
    public Funciones() {
        this.users = users;
        this.relation = relation;
        this.Usuarios = Usuarios;
    }
    
    /*METODOS Y PROCEDIMIENTOS*/
    
    public void Leertxt(){
    
            String line;
            String userstxt = "";
            String relationtxt ="";
            
            try{
               JFileChooser file=new JFileChooser();
               file.showOpenDialog(null);
               File abre=file.getSelectedFile();
               
               if(abre!=null){
                    FileReader archivos=new FileReader(abre);
                    BufferedReader br=new BufferedReader(archivos);
                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                    if (!line.isEmpty()) {
                        if ("Usuarios".equals(line)) {
                             Usuarios= true;   
                        }else if 
                            ("Relaciones".equals(line)) {
                             Usuarios = false;
                        }
                             
                        if (Usuarios = true){
                             userstxt += line + "\n";
                             
                        }else{
                             relationtxt += line + "\n";
                        }}
                    }
                  if ((!"".equals(relationtxt)) &&(!"".equals(userstxt))){
                    String[] UsersSplit = userstxt.split("\n");
                    String[] RelationSplit = relationtxt.split("\n");
                    
                    for (int i = 0; i < UsersSplit.length; i++) {
                        String[] UsersSplit2 = UsersSplit[i].split(",");
                         users[i] = UsersSplit2;
                    }
                    
                    for (int j = 0; j < RelationSplit.length; j++) {
                        String[] RelationSplit2 = RelationSplit[j].split(",");
                        
                         relation[j] = RelationSplit2;
                    }
                  }
                  
                  
                  br.close();
               }      
            } catch (IOException ex){
                System.out.println(ex);
                System.out.println("error al leer el txt");
        }
            
            
    }}
    
