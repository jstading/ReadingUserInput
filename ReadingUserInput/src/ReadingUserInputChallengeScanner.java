import java.util.Scanner;

public class ReadingUserInputChallengeScanner {
    public static void main(String[] args) {

        int count = 1;
        int sumOfNums = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Enter number #" + count + " ");
                String numInput = scanner.nextLine();
                int num1 = Integer.parseInt(numInput);
                sumOfNums = sumOfNums + num1;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number");
            }
        }while (count <= 5);
        System.out.println("The sum of the numbers is " + sumOfNums);
    }

}
