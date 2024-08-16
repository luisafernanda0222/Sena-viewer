import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");

            System.out.print("Ingrese una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
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
                    System.out.println("Saliendo Del Menù...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
