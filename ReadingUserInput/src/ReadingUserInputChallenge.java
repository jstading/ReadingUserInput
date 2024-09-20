public class ReadingUserInputChallenge {
    public static void main(String[] args){

        int count = 1;
        int sumOfNums = 0;

        do{
            try{
                String numInput = System.console().readLine("Enter number #" + count + " ");
                int num1 = Integer.parseInt(numInput);
                sumOfNums = sumOfNums + num1;
                count++;
            }catch (NumberFormatException badUserData){
                System.out.println("Invalid number");
            }
        }while(count <=5);

        System.out.println(sumOfNums);

    }

}
