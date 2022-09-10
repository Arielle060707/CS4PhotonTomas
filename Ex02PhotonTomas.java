public class Ex02PhotonTomas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int random = (int) Math.floor(Math.random()*10) + 1;
        
        System.out.println("Welcome to Higher or Lower! What would you like to do?");
        System.out.println("Start game");
        System.out.println("Change settings");
        System.out.println("End application");
        
        String choiceOne = "Start game";
        String choiceTwo = "Change settings";
        String choiceThree = "End application";
        int guessAtmpts = 3;
        boolean response = false;
        
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        
        if (userInput.equalsIgnoreCase(choiceOne))
        {
            do 
            {  
                while(guessAtmpts > 0)
                {
                    int userGuess = sc.nextInt();
                    System.out.println("You have " + guessAtmpts + " left. What is your guess?");
                
                    guessAtmpts--;
                
                    if (userGuess < random)
                    {
                        System.out.println("Guess higher! You have " + guessAtmpts + " guess(es) left. What is your guess?");
                    }
                    else if (userGuess > random)
                    {
                         System.out.println("Guess lower! You have " + guessAtmpts + " guess(es) left. What is your guess?");
                    }
                    else
                    {
                        System.out.println("You got it!");
                    }
                }
                System.out.println("Play again (y/n)?");
                
            }while (!response);
        }  
        
        /* (userInput.equalsIgnoreCase(choiceTwo))
        {
            what on earth do i do????
        }
        */
        if(userInput.equalsIgnoreCase(choiceThree))
        {
            System.out.println("\nThank you for playing!");
        }
    }
    
}
