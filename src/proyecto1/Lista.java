/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author smoreno
 */
public class Lista<T> {
    
    T siguiente;
    T valor;
    T anterior;
    int tamanio;

    public Lista() {
    }
    
    public T getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(T siguiente) {
        this.siguiente = siguiente;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getAnterior() {
        return anterior;
    }

    public void setAnterior(T anterior) {
        this.anterior = anterior;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    
}
