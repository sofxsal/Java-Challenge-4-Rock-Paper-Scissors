import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");

            String yourChoice = scan.nextLine();

            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);

            printResult(yourChoice, computerChoice, result);

        } else {
            System.out.println("Darn, some other time...!");
            System.exit(0);
        }

        scan.close();
    }

        public static String computerChoice() {
            double randomNumber = Math.random() * 3;
            int integer = (int)randomNumber;

            switch(integer) {
                case 0: return "rock";
                case 1: return "paper";
                case 2: return "scissors";
                default: return "";
            }
        }
        
        public static String result(String yourChoice, String computerChoice) {
            String result = "";

            if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
                result = "You win";
            } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
                result = "You lose";
            } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
                result = "You win";
            } else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
                result = "You lose";
            } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
                result = "You win";
            } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
                result = "You lose";
            } else {
                result = "It's a tie!";
            }
            return result;
        }
 
      public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\tYou chose: " + yourChoice);
        System.out.println("\tThe computer chose: " + computerChoice);
        System.out.println("\t" + result);
     }

}
