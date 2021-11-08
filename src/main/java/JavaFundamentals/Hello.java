package JavaFundamentals;
/**
 * A program that print name and Hello
 *
 * @ author Pavel Rudzko
 */


import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner scannerH = new Scanner(System.in);
        System.out.println("Введите свое имя ");
        name = scannerH.nextLine();

        System.out.printf("Hello,%s \n", name);


    }

}
