package clases;

public class Nodo {
    Object valor;
    Nodo siguienteNodo;
    
    public Nodo(Object valorEntrada){
        valor=valorEntrada;
        siguienteNodo=null;       
    }
    
    public Object obtenerValor(){
        return valor;
    }
    
    public void enlazarAlNodo(Nodo valorSiguienteNodo){
        siguienteNodo=valorSiguienteNodo;
    }
    
    public Nodo obtenerSiguienteNodo(){
        return siguienteNodo;
    }
}
