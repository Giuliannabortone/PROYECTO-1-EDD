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

    public Queue(Nodo head, Nodo back, int size) {
        this.head = null;
        this.back = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void Empty(){
        this.head = this.back = null;
        this.size = 0;
       
    }
    
    public void encolar(Nodo nuevo){
        if (this.isEmpty()){
            head = back = nuevo;
        }else{
            back = nuevo;
        }
        size++;
    } 
    
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







