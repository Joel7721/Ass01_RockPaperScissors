import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {

        boolean doneA = false;
        boolean doneB = false;
        Scanner scanner = new Scanner(System.in);
        String userResp = "";
        String moveA;
        String moveB;
        String trash;

        System.out.println("Welcome to Joel Mensah's Rock Paper Scissors Game!");
        System.out.println("When entering your move, please enter R for Rock, P for Paper, and S for Scissors (inputs can be uppercase or lowercase).");

        do{

            System.out.println("Player A enter your move: ");
            moveA = scanner.nextLine();



            if(moveA.equalsIgnoreCase("R")){

                do {
                    System.out.println("Player B enter your move: ");
                    moveB = scanner.nextLine();

                    if (moveB.equalsIgnoreCase("R")) {
                        System.out.println("Rock vs Rock it's a Tie!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else if (moveB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers Rock, Player B Wins!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else if (moveB.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks Scissors, Player A Wins!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else {
                        System.out.println("Player B has entered an invalid input of " + moveB);
                        doneB = false;

                    }
                }while(!doneB);

            }else if(moveA.equalsIgnoreCase("P")) {
                do{
                    System.out.println("Player B enter your move: ");
                    moveB = scanner.nextLine();

                    if (moveB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers Rock, Player A Wins!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else if (moveB.equalsIgnoreCase("P")) {
                        System.out.println("Paper vs Paper it's a Tie!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else if (moveB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors cuts Paper, Player B Wins");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else{
                        System.out.println("Player B has entered an invalid input of " + moveB);
                        doneB = false;

                    }
                }while(!doneB);
            }
            else if(moveA.equalsIgnoreCase("S")) {

                do{

                    System.out.println("Player B enter your move: ");
                    moveB = scanner.nextLine();

                    if (moveB.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks Scissors, Player B Wins!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else if (moveB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cuts Paper, Player A Wins!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else if (moveB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors vs Scissors it's a Tie!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            doneA = true;
                            doneB = true;
                        } else{
                            doneB = true;
                            doneA = false;
                        }
                    } else{
                        System.out.println("Player B has entered an invalid input of " + moveB);
                        doneB = false;
                    }
                }while(!doneB);
            } else {
                System.out.println("Player A has entered an invalid input of " + moveA);
                doneA = false;
            }





        }while(!doneA);
        System.out.println("Thank You For Playing!");

    }
}

