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
        String  users [][];
        String relation [][];
        boolean Usuarios;
        Arista matrizAd [][];
        private char label;
        private boolean visited;
        public int vertices [];

    public Grafo() {
        this.users= users;
        this.relation = relation;
        this.Usuarios = false;
        this.matrizAd = matrizAd;
        this.label = label;
        this.visited = false;
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
                    if (!line.isEmpty()) {
                        if ("Usuarios".equals(line)) {
                             Usuarios= true;  
 
                         
                        }else if 
                            ("Relaciones".equals(line)) {
                             Usuarios = false;
                             System.out.println("hola");
                        }
                             
                        if (Usuarios == true){
                             userstxt += line + "\n";
                        
                             
                        }else {
                             relationtxt += line + "\n";   
                        }}
                    }
                    
                  if ((!"".equals(relationtxt)) && (!"".equals(userstxt))){
                    String[] UsersSplit = userstxt.split("\n");
                    String[] RelationSplit = relationtxt.split("\n");
                    
                    for (int i = 0; i < UsersSplit.length; i++) {
                        String[] UsersSplit2 = UsersSplit[i].split(",");
                        System.out.println(Arrays.toString(users));
                         users[i] = UsersSplit2;
                         
                    }
                    
                    for (int j = 0; j < RelationSplit.length; j++) {
                        String[] RelationSplit2 = RelationSplit[j].split(",");
                         relation[j] = RelationSplit2;
                        
                    
                  }
                     for (int i = 0; i < relation.length; i++) {
                          System.out.println(i);  
                      }
                   
                    }
                  br.close();
               }      
            } catch (IOException ex){
                System.out.println("error al leer el txt");
        }
            
            
    }  
     public void crearMatrizAd(){
        Leertxt();
        for (int i = 0; i < relation.length; i++){ 
            System.out.println(relation.length);
        String relacion  [] = relation[i];
        int fila= Integer.parseInt(relacion[0]);
        int columna = Integer.parseInt(relacion[1]);
        int years = Integer.parseInt(relacion[2]);
        Arista aristaAux = new Arista(fila, columna, years);

        
         matrizAd[fila][columna] = aristaAux;
         matrizAd[columna][fila]= aristaAux;
         vertices[i] = fila;
         vertices[i+1]= columna;
          }
           
     
}
     public void recorridoBFS(){
         for (int i = 0; i < matrizAd.length; i++) {
             for (int j = 0; j < matrizAd.length; j++) {
                 System.out.println(j);
                 
                     
                 }
             }
             
         }
         
         
         
     }
     

       
           
    
       
       

       
       
    
    
    

    
       
       
   


