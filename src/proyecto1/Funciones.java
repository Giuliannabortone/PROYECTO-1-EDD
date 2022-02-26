/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
    
    
    public static void extraerInf(Component padre){
         try{
               JFileChooser file=new JFileChooser();
               file.showOpenDialog(null);
               File archivo=file.getSelectedFile();
               String ruta =  archivo.getAbsolutePath();
               if(archivo!=null && ruta.substring(ruta.length()-3).equalsIgnoreCase("txt")){
                    FileReader archivos=new FileReader(archivo);
                    BufferedReader br=new BufferedReader(archivos);
                    String line;
                    boolean resturantes = false;
                    boolean clientes = false;
                    boolean pedidos = false;
                    boolean rutas = false;
                    while ((line = br.readLine()) != null){
                        line = line.trim();
                        if(line.contains("Restaurantes")){
                            clientes = false;
                            pedidos = false;
                            rutas = false;
                            resturantes = true;
                        }else if (line.contains("Clientes")){
                            clientes = true;
                            pedidos = false;
                            rutas = false;
                            resturantes = false;
                        }else if (line.contains("Pedidos")){
                            clientes = false;
                            pedidos = true;
                            rutas = false;
                            resturantes = false;
                        }else if (line.contains("Rutas")){
                            clientes = false;
                            pedidos = false;
                            rutas = true;
                            resturantes = false;
                        }
                        
                        if(resturantes){
                            
                        }else if(pedidos){
                            
                        }else if(rutas){
                            
                        }else if(clientes){
                            
                        }  
                        
                    }
                  
                  br.close();
               }else{
                   
                   JOptionPane.showMessageDialog(padre, "Debe ingresar un archivo con extension '.txt' ");
                   
               }   
            } catch (IOException ex){
                System.out.println(ex);
                System.out.println("error al leer el txt");
        }
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
            
            
    }
}
    
