


import java.util.Scanner;

public class Main {

    static Scanner sc;
    static int op;


    public static void main(String[] args) {

        sc = new Scanner (System.in);


        do {
            pintaMenu();
            op = sc.nextInt();      sc.nextLine();  // Siempre tras sc.nextint(), sc.nextfloat() etc SIEMPRE PONDREMOS sc.nextLine() para recoger el Enter que los otros no recogen.
            realizarTrabajo();

        } while (op != 0);

    }




    private static void pintaMenu(){

        System.out.printf("\n\n");
        System.out.println("0. Fin");
        System.out.println("1. ArrayList");

        System.out.print("Elija opcion: ");



    }


    private static void realizarTrabajo(){
        switch (op){
            case 0:
                System.out.println("Eligió Fin. Hasta la proxima");
                break;


            case 1:
                new aisdArrayList();  // Se ejecutará el constructor
                break;


            default:
                System.out.println("Opción incorrecta. Pulse enter para continuar.");
                sc.nextLine();
                break;
        }
    }

}