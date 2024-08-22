import java.util.Scanner;


public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Seleccione;

        {
            System.out.println("SELECCIONE UN NUMERO:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");

            System.out.print(" Ingrese una opción: ");
            Seleccione = scanner.nextInt();

            switch (Seleccione) {
                case 1:

                    System.out.println();
                    break;
                case 2:

                    System.out.println();
                    break;
                case 3:

                    System.out.println();
                    break;
                case 4:

                    System.out.println();
                    break;
                case 5:

                    System.out.println();
                    break;
                case 6:

                    System.out.println();
                    break;
                case 0:
                    System.out.println("Saliendo Del Programa...");
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        while (Seleccione != 0) ;

        scanner.close();
    }
}


