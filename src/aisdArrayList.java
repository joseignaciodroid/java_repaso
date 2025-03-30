import java.util.ArrayList;

import java.util.Comparator;    // para ordenar el ArrayList personas.


public class aisdArrayList {


    // Declaramos el ArrayList para objetos Persona que sí vamos a usar en esta clase.
    public ArrayList <Persona> personas;




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
        personas = new ArrayList<Persona>();

        // Añadimos 4 personas:
        personas.add(new Persona("Juan", 25, "650-111-111"));
        personas.add(new Persona("Ana", 26, "650-222-222"));
        personas.add(new Persona("Eva", 27, "650-333-333"));
        personas.add(new Persona("Lucas", 28, "650-444-444"));


        // Mostramos los datos de Ana cuyo indice es 1:
        System.out.printf("\n\nPersona de indice 1: \n");
        System.out.printf("\t " + personas.get(1).getNombre() + "\t");
        System.out.printf("\t " + personas.get(1).getEdad() + "\t");
        System.out.printf("\t " + personas.get(1).getTelefono() + "\n");


        // Eliminamos a Eva cuyo indice es 2:
        personas.remove(2);


        // Modicamos el 2ª elemento del ArrayList personas (índice 1, Ana) con datos nuevos:
        Persona otraPersona = new Persona ("Franc", 30, "650-555- 555");
        personas.set(1, otraPersona);

        // Si sólo quisiéramos modificar uno de los atributos de una Persona utilizaríamos
        //      el método setter correspondiente de la clase Persona,
        //      por ejemplo a Franc (índice 1 del ArrayList) le cambiamos su edad 30 por 31:
        personas.get(1).setEdad(31);



        // Ordenamos por nombre y mostramos:
                System.out.printf("\n\n Personas ordenadas por nombre \n");
        personas.sort(Comparator.comparing((Persona::getNombre)));
        listarPersonas_for_normal();



        // Ordenamos por nombre y mostramos:
                System.out.printf("\n\n Personas ordenadas por edad \n");
        personas.sort(Comparator.comparing((Persona::getEdad)));
        listarPersonas_for_each();


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




}  // class
