/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFileChooser;

/**
 *
 * @author giubo
 */
public class Grafo{
        public String  users [][];
        public String relation [][];
        boolean Usuarios;
        Arista matrizAd [][];
   

    public Grafo() {
        this.users = users;
        this.relation = relation;
        this.Usuarios = Usuarios;
        this.matrizAd = matrizAd;
    }
        
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
                  
                     System.out.println(Arrays.toString(relation));
                    }
                  br.close();
               }      
            } catch (IOException ex){
                System.out.println(ex);
                System.out.println("error al leer el txt");
        }
            
            
    }  
     public void crearMatrizAd(){
     
        Leertxt();
      
        for (int i = 0; i < relation.length; i++){ 
           
        String relacion  [] = relation[i];
        int fila= Integer.parseInt(relacion[0]);
        int columna = Integer.parseInt(relacion[1]);
        int years = Integer.parseInt(relacion[2]);
        Arista aristaAux = new Arista(fila, columna, years);

         matrizAd[fila][columna] = aristaAux;
         matrizAd[columna][fila]= aristaAux;
           System.out.println(matrizAd);
           
         
         
       }
      
             
              
               
       }
           
       
       }
    
    
    

    
       
       
   


