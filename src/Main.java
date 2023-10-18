import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Приве, как тебя зовут?");
        Scanner sc = new Scanner();
        String name = sc.nextLine();

        int length = name.length();
        if (name.charAt(length).equals("а") || name.charAt(length).equals("я") ||  name.charAt(length).equals("и")){
            System.out.println("Приветик!");
        }
        else
            System.out.println("Здарова!");
    }
}