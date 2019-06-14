import java.util.Scanner;

public class ChuyenDoiNhietDo {

    public static void main(String[] args) {
        int choice;
        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Fahrenheit To Celsius");
        System.out.println("2.Celsius To Fahrenheit");
        System.out.println("0.Exit");
             choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fahrenheit(scanner);
                    break;
                case 2:
                    celsius(scanner);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
    public static void fahrenheit(Scanner scanner)
    {
        System.out.print("Fahrenheit = ");
        double fahrenheit = scanner.nextInt();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("celsius = "+celsius);
    }
    public static void celsius(Scanner scanner)
    {
        System.out.print("Celsius = ");
        double celsius = scanner.nextInt();
        double  fahrenheit = (9.0 / 5) * (celsius + 32);
        System.out.println("Fahrenheit = " +fahrenheit );
    }
}
