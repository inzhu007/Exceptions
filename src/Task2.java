import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array= new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        while (true) {
            try {
                System.out.print("enter index of array: ");
                int index = scanner.nextInt();
                System.out.println("elem. with index " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("try again");
            }
        }
    }
}
