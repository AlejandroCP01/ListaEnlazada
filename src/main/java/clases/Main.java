package clases;

public class Main  {
    public static void main(String args[]){
        
//Pruebas para clase Nodos
        /*
        Nodo primerObjeto=new Nodo("soy primer objeto");
        Nodo segundoObjeto=new Nodo("soy segundo objeto");
        Nodo tercerObjeto=new Nodo("soy tercer objeto");

        
        System.out.println(primerObjeto.obtenerValor().toString());

        primerObjeto.enlazarAlNodo(segundoObjeto);
        
        System.out.println(primerObjeto.obtenerSiguienteNodo().obtenerValor().toString());
        */
        
//Pruebas para clase Lsitas Enlazadas
       
        ListaEnlazada prueba=new ListaEnlazada();
        System.out.println(prueba.estaVacia());
        prueba.agregaPrimero('(');
        prueba.agregaPrimero(')');
        prueba.agregaPrimero('.');
        prueba.agregaPrimero(3.2);
        prueba.agregaPrimero(2);
        prueba.agregaPrimero('z');
        System.out.println(prueba.ObtenerIndex(2).toString());
        System.out.println(prueba.ObtenerIndex(0).toString());
        System.out.println(prueba.ObtenerIndex(0).toString());
        System.out.println(prueba.estaVacia());
        System.out.println(prueba.size());
        
        prueba.eliminarPrimero();
        System.out.println(prueba.ObtenerIndex(0).toString());
        System.out.println(prueba.size());
        prueba.eliminarIndex(0);
        System.out.println(prueba.ObtenerIndex(0).toString());
        prueba.cortar(3);
        System.out.println(prueba.size());
        System.out.println(prueba.ObtenerIndex(0).toString());
        System.out.println(prueba.ObtenerIndex(prueba.size()-1));
        prueba.eliminarFinal();
        System.out.println(prueba.ObtenerIndex(prueba.size()-1));
    }
    
}
