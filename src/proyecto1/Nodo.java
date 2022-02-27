/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author giubo
 */
public class Nodo {
    int integer;
    Nodo next;

    public Nodo(int integer) {
        this.integer = integer;
        this.next = null;
    }
    /**
     * Description: regresa el valor del integer
     * @return el valor de integer
     */
    public int valorInt(){
        return integer;
    }
    /**
     * Description: regresa el valor del siguiente nodo
     * @return el siguiente nodo
     */
    public Nodo getSiguiente() {
        return next;
    }
}

