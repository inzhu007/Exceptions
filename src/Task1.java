import java.util.InputMismatchException;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try{
            System.out.println("enter integer1:");
            int integer1 = scanner.nextInt();
            System.out.println("enter integer2:");
            int integer2 = scanner.nextInt();

            int sum = Sum(integer1, integer2);
            System.out.println("sum: " + sum);

            } catch (InputMismatchException e) {
                System.out.println("wrong input");
                scanner.nextLine();
            }
        }
    }

    public static int Sum(int integer1, int integer2) throws InputMismatchException {
        return integer1 + integer2;
    }

}





