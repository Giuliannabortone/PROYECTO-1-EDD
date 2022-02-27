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
    
    
    public static Repositorio extraerInf(Component padre){
         try{
               JFileChooser file=new JFileChooser();
               file.showOpenDialog(null);
               File archivo=file.getSelectedFile();
               if(archivo!=null){
               Repositorio repo = new Repositorio();
               String ruta =  archivo.getAbsolutePath();
               if(ruta.substring(ruta.length()-3).equalsIgnoreCase("txt")){
                    FileReader archivos=new FileReader(archivo);
                    BufferedReader br=new BufferedReader(archivos);
                    String line;
                    Lista<Usuario> listUsuario = new Lista();
                    Lista<Arista> listArista = new Lista();
                    Nodo<Usuario> nodoUsuarioEval = null;
                    Nodo<Arista> nodoAristaEval = null;
                    boolean usuarios = false;
                    boolean relaciones = false;
                    boolean primerUsuario = true;
                    boolean primerArista = true;
                    boolean cuerpo = true;
                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                        line = line.trim();
                        if(line.contains("Usuarios")){
                            relaciones = false;
                            usuarios = true;
                            cuerpo = false;
                        }else if (line.contains("Relaciones")){
                            if(nodoUsuarioEval != null){
                                nodoUsuarioEval.setSiguiente(null);
                                listUsuario.setUltimo(nodoUsuarioEval);
                            }
                            relaciones = true;
                            usuarios = false;
                            cuerpo = false;
                        }
                        
                        if(usuarios && cuerpo){
                            String[] arrUsua = line.split(",");
                            Usuario usuario = new Usuario();
                            usuario.setId(Integer.parseInt(arrUsua[0].trim()));
                            usuario.setUsuario(arrUsua[1].trim());
                            Nodo<Usuario> nodoUsuario = new Nodo();
                            nodoUsuario.setValor(usuario);
                            if(primerUsuario){
                                primerUsuario = false;
                                nodoUsuario.setAnterior(null);
                                listUsuario.setPrimero(nodoUsuario);
                            }else{
                                nodoUsuario.setAnterior(nodoUsuarioEval);
                                nodoUsuarioEval.setSiguiente(nodoUsuario);
                            }
                            
                            nodoUsuarioEval = nodoUsuario;                            
                            
                        }else if(relaciones && cuerpo){
                            String[] arrArista = line.split(",");
                            Arista arista = new Arista();
                            arista.setOrigen(Integer.parseInt(arrArista[0].trim()));
                            arista.setDestino(Integer.parseInt(arrArista[1].trim()));
                            arista.setYears(Integer.parseInt(arrArista[2].trim()));
                            Nodo<Arista> nodoArista = new Nodo();
                            nodoArista.setValor(arista);
                            if(primerArista){
                                primerArista = false;
                                nodoArista.setAnterior(null);
                                listArista.setPrimero(nodoArista);
                            }else{
                                nodoArista.setAnterior(nodoAristaEval);
                                nodoAristaEval.setSiguiente(nodoArista);
                            }
                            
                            nodoAristaEval = nodoArista; 
                        }
                        cuerpo = true;
                    }
                    nodoAristaEval.setSiguiente(null);
                    listArista.setUltimo(nodoAristaEval);
                    repo.setAristaList(listArista);
                    repo.setUsuariosList(listUsuario);
                    br.close();                  
                    return repo;
               }else{
                   
                   JOptionPane.showMessageDialog(padre, "Debe ingresar un archivo con extension '.txt' ");
                   
               }   
               }
            } catch (IOException ex){
                System.out.println(ex);
                System.out.println("error al leer el txt");
        }
         
         return null;
         
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
    
