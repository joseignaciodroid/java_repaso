import java.util.Scanner;

import java.util.ArrayList;


// Para ordenar el ArrayList personas,
//      cuyos elementos son objetos complejos con varios atributos: nombre, edad, telefono.
//      Permite ordenar atendiendo a varias claves.
import java.util.Comparator;




// Para ordenar con clases que implementan la interfaz Comparable,
//      como las clases wrapper (envoltorio) Integer, Double, String, etc.
//      que tienen un orden natural predefinido.
import java.util.Collections;
import java.util.Random;


public class aisdArrayList {


    // Declaramos el ArrayList para objetos Persona que sí vamos a usar en esta clase.
    private ArrayList <Persona> personas;

    // También declaramos este ArrayList para que veas cómo podemos ordenarlos
    //      de una forma diferente a cuando el ArrayList tiene objetos Persona.
    private ArrayList <Integer> nrosEnteros;



    // Las siguientes declaraciones no las uso pero échales un ojo.
    // Otras declaraciones para tipos primitivos.
    // Como los tipos primitivos no son clases, en su lugar
    //      se utilizan las clases wrapper correspondientes:

    ArrayList <Byte>    listaBytes;    // No usamos byte sino Byte que es una clase.
    ArrayList <Short>   listaShorts;   // No usamos sort sino Short.
    ArrayList <Integer> listaEnteros;  // No usamos int sino Integer.
    ArrayList <Long>    listaLargos;   // No usamos long sino Long.
    // etc
    ArrayList <Float>   listaFlotantes;
    ArrayList <Double>  listaDobles;
    ArrayList <Boolean> listaBooleanos;
    ArrayList <Character> listaCaracteres;




    // Constructor.
    // Aquí es donde hacemos todo.

    public aisdArrayList() {
        System.out.printf("\n\n\nConstructor de ArrayList");


        // Creamos el ArrayList declarado arriba a nivel de clase.
        personas = new ArrayList<>();

        // Añadimos 4 personas:
        personas.add(new Persona("111A","Juan", 25, "650-111-111"));
        personas.add(new Persona("222B", "Ana", 26, "650-222-222"));
        personas.add(new Persona("333C","Eva", 27, "650-333-333"));
        personas.add(new Persona("444D","Lucas", 28, "650-444-444"));


        // Mostramos los datos de Ana cuyo indice es 1:
        System.out.printf("\n\nPersona de indice 1: \n");
        System.out.printf("\t " + personas.get(1).getNombre() + "\t");
        System.out.printf("\t " + personas.get(1).getEdad() + "\t");
        System.out.printf("\t " + personas.get(1).getTelefono() + "\n");


        // Eliminamos a Eva cuyo indice es 2:
        personas.remove(2);


        // Modicamos el 2ª elemento del ArrayList personas (índice 1, Ana) con datos nuevos:
        Persona otraPersona = new Persona ("555E", "Franc", 30, "650-555- 555");
        personas.set(1, otraPersona);

        // Si sólo quisiéramos modificar uno de los atributos de una Persona utilizaríamos
        //      el método setter correspondiente de la clase Persona,
        //      por ejemplo a Franc (índice 1 del ArrayList) le cambiamos su edad 30 por 31:
        personas.get(1).setEdad(31);



        // Ordenamos por nombre y mostramos:
                System.out.printf("\n\n Personas ordenadas por nombre \n");
        personas.sort(Comparator.comparing(Persona::getNombre));
        listarPersonas_for_normal();



        // Ordenamos por nombre y mostramos:
                System.out.printf("\n\n Personas ordenadas por edad \n");
        personas.sort(Comparator.comparing((Persona::getEdad)));
        listarPersonas_for_each();


        //Se piden datos desde teclado y se añaden.
        addPersonaFromKeyboard();
        // Hacemos otro listado para comprobar que se han añadido correctamente:
        listarPersonas_for_normal();




        // El resto: trabajamos con un ArrayList de algún tipo primitivo
        //      como los int, por ejemplo, en lugar de ser cada elemento un Objeto.
        nrosEnteros = new ArrayList<Integer>();  // Integer es la clase wrapper (envoltorio) para tipos primitivos int.

        Random random = new Random();
        for (int i=0; i < 5; i++){        // Añadimos 5 enteros entre 0 y 10.
            nrosEnteros.add( random.nextInt(11));
        }

        // Sustituimos el elemento random de posición 3 por el valor 55555.
        nrosEnteros.set(3, 55555);
        

        // Ordenamos el ArrayList de números enteros.
        // En lugar de usar la clase Comparator que es útil para objetos complejos
        //      como Persona que tienen varios atributos (nombre, edad, telefono)
        // usaremos Collections que es útil para ordenar tipos primitivos.
        Collections.sort(nrosEnteros);




    }  // constructor




    public void listarPersonas_for_normal(){
        for (int i=0; i < personas.size(); i++){
            Persona unaPersona = personas.get(i);
            System.out.printf(
                    i + "\t" +
                            unaPersona.getNombre()  + "\t" +
                            unaPersona.getEdad() + "\t" +
                            unaPersona.getTelefono() + "\n"
            );      // printf
        }           // for
    }




    public void listarPersonas_for_each(){

        for (Persona p : personas){
            System.out.printf(
                    p.getNombre()  + "\t" +
                            p.getEdad() + "\t" +
                            p.getTelefono() + "\n"
            );
        }
    }



    public void addPersonaFromKeyboard(){
        // Pedir datos desde teclado y añadirlos al ArrayList personas.

        System.out.printf("\n\n\nRegistraremos nuevos datos desde teclado:\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el dni de la persona: ");
        String dni = sc.nextLine();

        System.out.println("Dime el nombre de la persona: ");
        String nombre = sc.nextLine();

        System.out.println("Dime la edad de la persona: ");
        int edad = sc.nextInt(); sc.nextLine();

        System.out.println("Dime el teléfono de la persona: ");
        String telefono = sc.nextLine();

        personas.add(new Persona(dni,nombre,edad,telefono));


    }


}  // class
