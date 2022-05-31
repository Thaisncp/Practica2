package practica2;
import java.util.ArrayList;
import org.github.jamm.MemoryMeter;

/**
 *
 * @author Thais Cartuche
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MemoryMeter meter= MemoryMeter.builder().build();
        System.out.println("\t\t\t-_-_-_-STRING-_-_-_-");
        String vacio = "";
        String lleno = "Hola mundo";
        System.out.println("___________________________________________________________");
        System.out.println("| string vacio: "+meter.measureDeep(vacio)+" bits\t|\t"+"string lleno: "+meter.measureDeep(lleno)+" bits |");
        System.out.println("___________________________________________________________\n");  
        
        System.out.println("\t\t-_-_-_-_DATOS PRIMITIVOS-_-_-_-_");
        
        System.out.println("\t\t\t-_-_-_-_BYTE-_-_-_-_");
        byte vacio1 = 0;
        byte lleno1 = 100;
        System.out.println("___________________________________________________________");
        System.out.println("| byte vacio: "+meter.measureDeep(vacio1)+" bits\t\t|\t"+"byte lleno: "+meter.measureDeep(lleno1)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t\t--_-_-_-_SHORT-_-_-_-_");
        short vacio2 = 0;
        short lleno2 = 17;
        System.out.println("___________________________________________________________");
        System.out.println("| short vacio: "+meter.measureDeep(vacio2)+" bits\t\t|\t"+"short lleno: "+meter.measureDeep(lleno2)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t\t-_-_-_-_INT-_-_-_-_");
        int vacio3 = 0;
        int lleno3 = 364;
        System.out.println("___________________________________________________________");
        System.out.println("| int vacio: "+meter.measureDeep(vacio3)+" bits\t\t|\t"+"int lleno: "+meter.measureDeep(lleno3)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t\t-_-_-_-_LONG-_-_-_-_");
        long vacio4 = 0;
        long lleno4 = 364234;
        System.out.println("___________________________________________________________");
        System.out.println("| long vacio: "+meter.measureDeep(vacio4)+" bits\t\t|\t"+"long lleno: "+meter.measureDeep(lleno4)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t\t-_-_-_-_FLOAT-_-_-_-_");
        float vacio5 = 0;
        float lleno5 = 456456f;
        System.out.println("___________________________________________________________");
        System.out.println("| float vacio: "+meter.measureDeep(vacio5)+" bits\t\t|\t"+"float lleno: "+meter.measureDeep(lleno5)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t\t-_-_-_-_DOUBLE-_-_-_-_");
        double vacio6 = 0;
        double lleno6 = 45645.654;
        System.out.println("___________________________________________________________");
        System.out.println("| double vacio: "+meter.measureDeep(vacio6)+" bits\t|\t"+"double lleno: "+meter.measureDeep(lleno6)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t\t-_-_-_-_CHAR-_-_-_-_");
        char vacio7 = 0;
        char lleno7 = 'c';
        System.out.println("___________________________________________________________");
        System.out.println("| char vacio: "+meter.measureDeep(vacio7)+" bits\t\t|\t"+"char lleno: "+meter.measureDeep(lleno7)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t\t-_-_-_-_BOOLEAN-_-_-_-_");
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("___________________________________________________________");
        System.out.println("| boolean verdadero: "+meter.measureDeep(verdadero)+" bits\t|\t"+"boolean falso: "+meter.measureDeep(falso)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t-_-_-_-_DATOS DE TIPO ARREGLO-_-_-_-_");
        
        System.out.println("\t\t-_-_-_-_ARREGLO DE STRINGS-_-_-_-_");
        String [] ArregloVacio1 = new String [0];
        String [] ArregloLleno1 = {"trabajo", "Hola", "mundo", "casa", "efimero"};
        System.out.println("___________________________________________________________");
        System.out.println("| arreglo vacio: "+meter.measureDeep(ArregloVacio1)+" bits\t|\t"+"arreglo lleno: "+meter.measureDeep(ArregloLleno1)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t-_-_-_-_ARREGLO DE ENTEROS-_-_-_-_");
        int [] ArregloVacio2 = new int [0];
        int [] ArregloLleno2 = {18, 343, 35, 56, 34, 54};
        System.out.println("___________________________________________________________");
        System.out.println("| arreglo vacio: "+meter.measureDeep(ArregloVacio2)+" bits\t|\t"+"arreglo lleno: "+meter.measureDeep(ArregloLleno2)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t-_-_-_-_ARREGLO DE DOUBLE-_-_-_-_");
        double [] ArregloVacio3 = new double [0];
        double [] ArregloLleno3 = {18.45, 343.8, 35.45, 56.5, 34.23, 54.04};
        System.out.println("___________________________________________________________");
        System.out.println("| arreglo vacio: "+meter.measureDeep(ArregloVacio3)+" bits\t|\t"+"arreglo lleno: "+meter.measureDeep(ArregloLleno3)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t-_-_-_-_ARREGLO DE CHAR-_-_-_-_");
        char [] ArregloVacio4 = new char [0];
        char [] ArregloLleno4 = {'c', 'a', 's', 'i', 'n', 'o', 't', 'h', 'a', 'i', 's'};
        System.out.println("___________________________________________________________");
        System.out.println("| arreglo vacio: "+meter.measureDeep(ArregloVacio4)+" bits\t|\t"+"arreglo lleno: "+meter.measureDeep(ArregloLleno4)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t-_-_-_-_ARREGLO DE LONG-_-_-_-_");
        long [] ArregloVacio5 = new long [0];
        long [] ArregloLleno5 = {78638, 3234, 565, 5657, 2439846};
        System.out.println("___________________________________________________________");
        System.out.println("| arreglo vacio: "+meter.measureDeep(ArregloVacio5)+" bits\t|\t"+"arreglo lleno: "+meter.measureDeep(ArregloLleno5)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t-_-_-_-_LISTA ENLAZADA-_-_-_-_");
        ListaEnlazada lista = new ListaEnlazada();
        ListaEnlazada listaLlena = new ListaEnlazada();
        listaLlena.insertar("Thais1");listaLlena.insertar("Nicol");listaLlena.insertar("Cartuche");listaLlena.insertar("Peralta");listaLlena.insertar("Victor");
        listaLlena.insertar("Rambo");listaLlena.insertar("Hilary");listaLlena.insertar("Madeley");listaLlena.insertar("Calva");listaLlena.insertar("Camacho");
        listaLlena.insertar("Cocina");listaLlena.insertar("Sala");listaLlena.insertar("Baño");listaLlena.insertar("Muebles");listaLlena.insertar("Cuarto");
        listaLlena.insertar("Mesa");listaLlena.insertar("Toalla");listaLlena.insertar("Lampara");listaLlena.insertar("Espejo");listaLlena.insertar("Cuchara");
        listaLlena.insertar("Computadora");listaLlena.insertar("Alcohol");listaLlena.insertar("Cerveza");listaLlena.insertar("Escritorio");listaLlena.insertar("Escalera");
        System.out.println("___________________________________________________________");
        System.out.println("| lista vacio: "+meter.measureDeep(lista)+" bits\t\t|\t"+"lista llena: "+meter.measureDeep(listaLlena)+" bits |");
        System.out.println("___________________________________________________________\n");
        
        System.out.println("\t\t-_-_-_-_ARRAYLIST-_-_-_-_");
        ArrayList<String> ArrayVacio = new  ArrayList<String>();
        ArrayList<String> ArrayLleno = new  ArrayList<String>();
        ArrayLleno.add("Thais");ArrayLleno.add("Nicol");ArrayLleno.add("Switch");ArrayLleno.add("Tequila");ArrayLleno.add("Ron");
        ArrayLleno.add("Cantaclaro");ArrayLleno.add("Cerveza");ArrayLleno.add("Vino");ArrayLleno.add("Piña Colada");ArrayLleno.add("whisky");
        ArrayLleno.add("Zhumir");ArrayLleno.add("Vodka");ArrayLleno.add("Punta");ArrayLleno.add("Cristal");ArrayLleno.add("Monte Carlo");
        ArrayLleno.add("Siembra");ArrayLleno.add("Club");ArrayLleno.add("Pilsener");ArrayLleno.add("Tres cruces");ArrayLleno.add("Baldore");
        ArrayLleno.add("Love");ArrayLleno.add("Tinto");ArrayLleno.add("Rambo");ArrayLleno.add("Corona");ArrayLleno.add("jack Daniels");
        System.out.println("___________________________________________________________");
        System.out.println("| arreglo vacio: "+meter.measureDeep(ArrayVacio)+" bits\t|\t"+"arreglo lleno: "+meter.measureDeep(ArrayLleno)+" bits |");
        System.out.println("___________________________________________________________\n");
    }    
}

