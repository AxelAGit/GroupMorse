import java.util.Scanner;

public class Menu {

    static String choice = "";
    Scanner scan = new Scanner(System.in);

    void switchCase() {

        do {
            System.out.println("What would you like to do?");
            System.out.println("1. English to Morse");
            System.out.println("2. Morse to English");
            System.out.println("3. Exit application");
            System.out.println();
            System.out.print("Enter choice:");

            choice = scan.nextLine();

            switch (choice) {

                case "1":

                    TranslateMorse.morseToEng("s");
                    break;

                case "2":

                default:
                    System.out.println("Invlaid choice. choose between 1-3");
                    break;
            }
        } while (true);
    }
}