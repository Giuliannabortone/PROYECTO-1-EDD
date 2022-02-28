/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author smoreno
 * @param <T>
 */
public class Lista<T> {
    
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamanio;

    public Lista() {
    }
    
    
    
	public void eliminarAlFinal() {
		Nodo<T> nodoEval = this.getPrimero();
		for (int i = 1; i < this.getTamanio()-2 ; i++) {
			nodoEval = nodoEval.getSiguiente();
		}
		nodoEval.getSiguiente().setAnterior(null);
		nodoEval.setSiguiente(null);
		this.setUltimo(nodoEval);
		this.setTamanio(this.getTamanio()-1);
	}
	
	public void agregarAlFinal(T valor) {
		Nodo<T> ultim = new Nodo();
                ultim.setValor(valor);
                if(this.getPrimero()==null){
                    this.setPrimero(ultim);
                }
                if(this.getUltimo()!= null){
                    this.getUltimo().setSiguiente(ultim);
                    ultim.setAnterior(this.getUltimo());
                }
		this.setUltimo(ultim);
		this.setTamanio(this.getTamanio()+1);
	}

	public void agregarAlInicio(T valor) {
		Nodo<T> primerNodo = new Nodo();
                primerNodo.setValor(valor);
		primerNodo.setSiguiente(this.getPrimero());
		this.getPrimero().setAnterior(primerNodo);
		this.setPrimero(primerNodo);
		this.setTamanio(this.getTamanio()+1);
	}

	public void eliminarAlInicio() {
		Nodo inicio = this.getPrimero();
                if(inicio.getSiguiente()!=null){
		inicio.getSiguiente().setAnterior(null);
		this.setPrimero(inicio.getSiguiente());
                }else{
                    this.setPrimero(null);
                }
		inicio.setSiguiente(null);
		this.setTamanio(this.getTamanio()-1);
	}

	public void agregarEnPosicion(T valor, int posicion) {
		if (this.getTamanio() - posicion < -1) {
		} else if (posicion == 1) {
			this.agregarAlInicio(valor);
		} else if (this.getTamanio() - posicion == -1) {
			this.agregarAlFinal(valor);
		} else {
			Nodo nodoEval = this.getPrimero();
			for (int i = 1; i < posicion - 1; i++) {

				nodoEval = nodoEval.getSiguiente();
			}
			Nodo nuevoNodo = new Nodo();
                        nuevoNodo.setValor(valor);
			nuevoNodo.setSiguiente(nodoEval.getSiguiente());
			nuevoNodo.setAnterior(nodoEval);
			nodoEval.getSiguiente().setAnterior(nuevoNodo);
			nodoEval.setSiguiente(nuevoNodo);

			this.setTamanio(this.getTamanio() + 1);

		}
	}

	public void eliminarEnPosicion(int posicion) {
		
		if (this.getTamanio() - posicion < -1) {
		} else if (posicion == 1) {
			this.eliminarAlInicio();
		} else if (this.getTamanio() - posicion == -1) {
			this.eliminarAlFinal();
		} else {
			Nodo nodoEval = this.getPrimero();
			for (int i = 1; i < posicion - 1; i++) {

				nodoEval = nodoEval.getSiguiente();
			}
			Nodo nodoAEliminar = nodoEval.getSiguiente();
			nodoAEliminar.getSiguiente().setAnterior(nodoEval);
			nodoEval.setSiguiente(nodoAEliminar.getSiguiente());
			nodoAEliminar.setSiguiente(null);
			nodoAEliminar.setAnterior(null);

			this.setTamanio(this.getTamanio() - 1);

		}
	}
    

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
}
