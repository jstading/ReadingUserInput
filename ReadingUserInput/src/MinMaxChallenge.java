import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args){

        int min = 0;
        int max = 0;
        int loopCount = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Enter an integer, or enter a character to quit: ");
                String numInput = scanner.nextLine();
                int num1 = Integer.parseInt(numInput);

                if (loopCount == 0){
                    max = num1;
                    min = num1;
                }else if (num1 <= min){
                    min = num1;
                }else if (num1 >= max){
                    max = num1;
                }

            }catch (NumberFormatException badUserData){
                break;
            }
        loopCount++;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }
}
