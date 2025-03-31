import java.util.*;



/*
    Map es una interfaz.

    Las clases que implementan la interfaz Map (HashMap, TreeMap y LinkedHashMap)
    permiten añadir elementos de cualquier tipo con una clave para recuperarlos
    posteriormente. Estas claves no se pueden repetir. Por eso se habla de
    parejas clave/valor. Si fuéramos a almacenar personas su clave puede ser
    el DNI que es distinto para cada una, salvo que sean menores. Si fuéramos
    a almacenar perros u otros objetos podemos montarnos un autonumérico.

    Hay 3 clases muy parecidas que implementan la interfaz Map
    y por ello tienen los mismos métodos, o sea que se usan igual.
    Éstas son:
    - HashMap: que no garantiza ningún orden al recuperar los datos.
    - TreeMap: cuyo orden al recuperar los datos será el de la clave de recuperación de datos.
    - LinkedHashMap: cuyo orden será el mismo en el que han sido añadidos.


    Consecuencia de que estas 3 clases implementen la interfaz Map es que:
    - Declararemos una variable como de tipo Map.
    - Le haremos un new como de tipo HashMap, TreeMap o LinkedHashMap.

 */




public class aisdMap {

    Map<String, Persona> personas;

    Map<Integer, Perro> perros;
    int contPerros = 0;


    // Constructor
    public aisdMap() {

        System.out.printf("\n\n\nProbando Map\n============\n");


        personas = new TreeMap<>();
        perros = new HashMap<>();

        Persona unaPersona = new Persona ("111A","Luis",52,"633000001");
        personas.put(unaPersona.getDni(), unaPersona);

        if (personas.containsValue(unaPersona)){
            System.out.println("Sí contiene " + unaPersona.getNombre());
        }
        else {
            System.out.println("El objeto correspondiente a " + unaPersona.getNombre() + "No ha sido detectado");
        }

        personas.put("222B", new Persona("222B", "Felipe", 15, "633000002"));
        personas.put("333C", new Persona("222B", "Ana", 20, "633000003"));
        personas.put("444D", new Persona("444D", "Franc", 30, "633000004"));

        //Recuperamos los datos de Ana y los mostramos en pantalla:
        //  pero primero nos aseguramos que su clave (el dni) aún
        //  continúa existiendo en el Map:
        if (personas.containsKey("222B")) {
            System.out.println(personas.get("222B").toString());
        }
        else {
            System.out.println("Los datos de Ana con clave '222B' ya no existen.");
        }


        //Eliminamos del Map a Ana
        personas.remove("222B");
        System.out.println("Ana eliminada.");








        iterarMap_personas();



        //Se piden datos desde teclado y se añaden.
        addPersonaFromKeyboard();
        iterarMap_personas();


        // Hacemos lo mismo con los perros
        perros.put(contPerros,new Perro("Duque",15,"Yorkshire"));
        perros.put(++contPerros,new Perro("Rex",10,"Gran Danés"));
        perros.put(++contPerros,new Perro("Nina",9,"Pincher"));






    }  // Fin del Constructor



    // Recorremos el Map completo
    public void iterarMap_personas(){

        System.out.printf("\n\nElementos del Map:\n");
        Iterator<String> it = personas.keySet().iterator();

        while (it.hasNext()){
            // obtenemos la siguiente persona

            String clave =  it.next();
            System.out.println(personas.get(clave).toString());
        }
    }





    public void addPersonaFromKeyboard(){
        // Pedir datos desde teclado y añadirlos al ArrayList personas.

        System.out.printf("\n\n\nRegistraremos nuevos datos desde teclado:\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el dni de la persona: ");
        String dni = sc.nextLine();

        if (personas.containsKey(dni)) {
            // Para evitar que se pierdan los datos que ya existen
            //      con este dni.
            // Podríamos preguntar si quiere registrar nuevos datos
            //      para ese DNI. pero como esto es un resumen ...
            System.out.println("La clave ya existe");

        }
        else {
            System.out.println("Dime el nombre de la persona: ");
            String nombre = sc.nextLine();

            System.out.println("Dime la edad de la persona: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Dime el teléfono de la persona: ");
            String telefono = sc.nextLine();

            personas.put(dni, new Persona(dni, nombre, edad, telefono));

        }
    }
} // fin de class

