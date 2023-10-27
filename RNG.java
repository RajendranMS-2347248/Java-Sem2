import java.util.*;

class App {

    public static void main(String[] args) {

        int counter = 5;
        int number = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        System.out.println("guess the number between 1 and 100");
        Scanner scanner = new Scanner(System.in);

        do 
        {
            int inputNumber = scanner.nextInt();
            counter--;
            if (counter == 0) {
                    System.out.println("You have used all of your attempts! The answer was " + number + ".");
                    break;
            }
            System.out.print("Enter your guess: ");
            

            if (inputNumber == number) {
                System.out.println("Congratulations, you are correct!");
                break;
            } 
            else if (inputNumber > number) {
                System.out.println("Your guess is too high.");
                
                
            }
            
            else {
                System.out.println("Your guess is too low.");
            }
        }while(counter!=0);
        scanner.close();
    }
}
