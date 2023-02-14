package clases;

public class ListaEnlazada {
    Nodo cabeza;
    int size;
    
    public ListaEnlazada(){
        cabeza=null;                            
    }
    
    public Object ObtenerIndex(int index){
        int cont=0;
        Nodo temp=cabeza;
        
        while (cont<index){
            temp=temp.obtenerSiguienteNodo();
            cont++;
        }
        return temp.obtenerValor();
    }
    
     public void eliminarFinal(){
        int cont=0;
        Nodo temp=cabeza;
        if (size==1)
            cabeza=null;
        else
        {
            while (cont<size-1){
                temp=temp.obtenerSiguienteNodo();
                cont++;
            }        
            temp.enlazarAlNodo(null);
        }
        size--;                      
    }
     
    public void agregaPrimero(Object obj){
        if (estaVacia())
            cabeza= new Nodo(obj);
        else{
            Nodo temp=cabeza;
            Nodo nuevo=new Nodo(obj);
            nuevo.enlazarAlNodo(temp);
            cabeza=nuevo;            
        }
        size++;
    }
    
    public boolean estaVacia(){
        return (cabeza==null)?true:false;
    }
    
    public int size(){
        return size;
    }
    
    public void eliminarPrimero(){
        cabeza=cabeza.obtenerSiguienteNodo();
        size--;
    }
    
    public void eliminarIndex(int index){
        int cont=0;
        Nodo temp=cabeza;
        
        if (index==0)
            cabeza=cabeza.obtenerSiguienteNodo();
        else{  
            while (cont<index-1){
                temp=temp.obtenerSiguienteNodo();
                cont++;
            }
            temp.enlazarAlNodo(temp.obtenerSiguienteNodo().obtenerSiguienteNodo());
        }
        size--;        
    }
    
    public void cortar(int index){
        int cont=0;
        Nodo temp=cabeza;
        
        
        while (cont<index-1){
            temp=temp.obtenerSiguienteNodo();
            cont++;
        }
        temp.enlazarAlNodo(null);    
        size=index;      
    }
}
