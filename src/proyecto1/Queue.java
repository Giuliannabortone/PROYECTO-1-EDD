/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author giubo
 */
public class Queue {
    public Nodo head;
    public Nodo back;
    public int size;

    /**
     * Description: Constructor de la colaq 
     * 
     * @param head cabeza de la cola
     * @param back tail de la cola
     * @param size tamanno de la cola
     */
    public Queue() {
        this.head = null;
        this.back = null;
        this.size = 0;
    }
     /**
     * Description: Revisa que la cola esta vacia y retorma un booleano. 
     * True si esta vacia y False si no
     * @return 
     */
    public boolean isEmpty(){
        return head == null;
    }
    
    public void Empty(){
        this.head = this.back = null;
        this.size = 0;
       
    }
     /**
     * Description: Agrega el elemento de la cola
     * @param nuevo el nodo a añadir
     */
    public void encolar(Nodo nuevo){
        if (this.isEmpty()){
            head = back = nuevo;
        }else{
            back = nuevo;
        }
        size++;
    } 
     /**
     * Description: Elimina el elemento de la cola
     */
        public void desencolar(){
        if (this.isEmpty()){
            System.out.println("La cola esta vacio. ");
        }else if (size == 1){
            this.Empty();
        }else{
           size--;
        }
    }
        
    }







