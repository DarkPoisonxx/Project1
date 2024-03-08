package Game;

public class GameEngine {
    private player player1;
    private player player2;
    private static player currentPlayer;
    private static player currentOpponent;

    public GameEngine(player input1, player input2) {
        this.player1 = input1;
        this.player2 = input2;
    }

    public void startGame() {
        
        System.out.println("Let the Pokemon Card Game begin!");
            player1.beginningHand(player1);
            player2.beginningHand(player2);
           // Set the starting player
            currentPlayer= player1;
            currentOpponent = player2;
                while (!isGameOver()) {
            // Display current player's turn 
                    System.out.println(currentPlayer.getName() + "'s turn:");

            // Perform turn logic 
                    currentPlayer.playTurn();

            // Switch to the next player for the next turn
            //Switch Opponents
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                    currentOpponent = (currentOpponent == player2 ? player1 : player2);
        }
        if(player1.getDeck().isEmpty() ||  player2.getPrize().isEmpty())
            System.out.println("Player 2 Wins!");
        else
            System.out.println("Player 1 Wins!");
    }

    private boolean isGameOver() {
        // Checks to see if either players hands are empty which will end the game
        return player1.getDeck().isEmpty() || player2.getDeck().isEmpty()||player1.getPrize().isEmpty() || player2.getPrize().isEmpty();
        
        
    }

    
    public static player getCurrentOpponent() {
        return currentOpponent;
    }
    public static player getCurrentPlayer() {
        return currentPlayer;
    }
    
    
}