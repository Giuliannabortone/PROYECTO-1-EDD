/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

/**
 *
 * @author giubo
 */
public class PROYECTO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo grafito = new Grafo();
        grafito.crearMatrizAd();

//    Esto es para lo del camino min 

            long matrizA[][] ={};
            Camino_Min_Floyd ruta = new Camino_Min_Floyd();
            System.out.println(ruta.AlgoritmoFloyd(matrizA));
        
        

}
}