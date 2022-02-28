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
//            
//                    
//                    Nodo<Usuario> usuarios = Main.repo.getUsuariosList().getPrimero();
//                    Nodo<Arista> relaciones = Main.repo.getAristaList().getPrimero();
//                    String usuariosStr = "";
//                    String relacionesStr ="";
//                    while(usuarios!=null){
//                        
//                        usuariosStr = usuariosStr + String.valueOf(usuarios.getValor().getId()) + "," + usuarios.getValor().getUsuario() + "\n";
//                        usuarios = usuarios.getSiguiente();
//                        
//                    }
//                    
//                    while(relaciones!=null){
//                        
//                        relacionesStr = relacionesStr + String.valueOf(relaciones.getValor().getOrigen()) + "," + relaciones.getValor().getDestino()+ "," + relaciones.getValor().getYears()+ "\n";
//                        relaciones = relaciones.getSiguiente();                        
//                    }
//                    
//                  if ((!"".equals(relacionesStr)) && (!"".equals(usuariosStr))){
//                    String[] UsersSplit = usuariosStr.split("\n");
//                    String[] RelationSplit = relacionesStr.split("\n");
//                    
//                    for (int i = 0; i < UsersSplit.length; i++) {
//                        String[] UsersSplit2 = UsersSplit[i].split(",");
//                        System.out.println(Arrays.toString(users));
//                         users[i] = UsersSplit2;
//                         
//                    }
//                    
//                    for (int j = 0; j < RelationSplit.length; j++) {
//                        String[] RelationSplit2 = RelationSplit[j].split(",");
//                        relation[j] = RelationSplit2;
//                        
//                    
//                  }
//                     for (int i = 0; i < relation.length; i++) {
//                          System.out.println(i);  
//                      }
//                   
//                    }        


                       
            
    }  
     public void crearMatrizAd(){
         
         Nodo<Arista> relaciones = Main.repo.getAristaList().getPrimero();
         Lista<Usuario> usuarios = Main.repo.getUsuariosList();
         Nodo<Usuario> usr = usuarios.getPrimero();
         String usuariosStr = "";
        while(usr!=null){
            usuariosStr = usuariosStr + String.valueOf(usr.getValor().getId()) + ",";
            usr = usr.getSiguiente();

        }
         String usrId[] = usuariosStr.split(",");
         
            int[][] ady;
            ady = new int[usrId.length][usrId.length];
            for (int[] is : ady) {
                for (int i : is) {
                    i=0;
                }
         }
            while(relaciones!=null){
                int org = relaciones.getValor().getOrigen();
                int dest = relaciones.getValor().getDestino();
                int year = relaciones.getValor().getYears();
                int orgIndex = 0;
                int destIndex = 0;
                for(int i=0; i<usrId.length; i++){
                    
                    if(Integer.parseInt(usrId[i]) == org)orgIndex = i;
                    if(Integer.parseInt(usrId[i]) == dest)destIndex = i;
                    
                }
                ady[destIndex][orgIndex] = year;
                relaciones = relaciones.getSiguiente();
            }
            for(int j=0; j< usrId.length; j++){
                
                    System.out.print( usrId[j] + "  " );        
                
            }
            System.out.println();
            for(int i=0; i< ady.length; i++){
                System.out.print( usrId[i] + "  " );
            for(int j=0; j< ady.length; j++){
                
                    System.out.print( ady[i][j] + "  " );        
                
            }
            System.out.println();
        }          
    Main.matrizAdy = ady;
     
}
     public void recorridoBFS(){
         for (int i = 0; i < matrizAd.length; i++) {
             for (int j = 0; j < matrizAd.length; j++) {
                 System.out.println(j);
                 
                     
                 }
             }
             
         }
         
         
         
     }
     

       
           
    
       
       

       
       
    
    
    

    
       
       
   


