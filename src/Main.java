import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = 0;
        String trash = "";

        System.out.print("Enter your Birth Month (1-12): ");

        if(in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); //Clear the buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + trash);
            }
        } else {
            trash = in.nextLine(); // Read invalid input
            System.out.println("YOu entered an incorrect month value" + trash);
        }

    }
}