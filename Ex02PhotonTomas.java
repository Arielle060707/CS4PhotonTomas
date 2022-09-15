public class Ex02PhotonTomas {
    private static String userPlay; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int minNum = 1;
        int maxNum = 10;
        int random = (int) Math.floor(Math.random()*maxNum) + minNum;
        int guessAtmpts = 3;
        int numGuess;
        char userPlay = 0;
              
        do
        {
            System.out.println("Welcome to Higher or Lower! What would you like to do?" 
            + "\n-Start game" 
            + "\n-Change settings" 
            + "\n-End application");
        
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            
            if(userInput.equalsIgnoreCase("Start game"))
            {
                int i = guessAtmpts;
                
                while(i >= 0)
                {
                    System.out.println("You have " + i + " guess(es) left. What is your guess?");
                    numGuess = sc.nextInt();
                    
                    if(numGuess == random)
                    {
                       System.out.println("You got it!");
                    }
                    else if (numGuess > random)
                    {
                        i--;
                        System.out.println("Guess lower! You have " + i + " guess(es) left. What is your guess?");
                        numGuess = sc.nextInt();
                        
                        if (numGuess == random)
                        {
                            System.out.println("You got it!");
                        }    
                    }
                    else if (numGuess < random)
                    {
                        i--;
                        System.out.println("Guess higher! You have " + i + " guess(es) left. What is your guess?");
                        numGuess = sc.nextInt();
                        
                        if (numGuess == random)
                        {
                            System.out.println("You got it!");
                        }    
                    }
                    
                    break;
                } 
                
                System.out.println("Play again (y/n)? ");
                userPlay = sc.next().charAt(0);
            }    
            else if (userInput.equalsIgnoreCase("Change settings"))
            {
                System.out.println("What is the lower limit of the number?" 
                + "\nWhat is the upper limit of the number?" 
                + "\nHow many guesses are allowed?");
                
                System.out.println("Lower limit: ");
                minNum = sc.nextInt();
                System.out.println("Upper limit: ");
                maxNum = sc.nextInt();
                System.out.println("Guesses: ");
                guessAtmpts = sc.nextInt();
            }
            else if (userInput.equalsIgnoreCase("End application"))
            {
                System.out.println("\nThank you for playing!");
                break; //ending the loop quickly
            }    
            else 
            {
                System.out.println("You lost...");
            }    
        
        }while(userPlay == 'y');
    }
}
