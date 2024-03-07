package Game;

public class GameEngine {
    private player player1;
    private player player2;
    private static player currentPlayer;
    private static player currentOpponent;

    public GameEngine(player input1, player input2) {
        this.player1 = input1;
        this.player2 = input2;
        
         // Set the starting player
    }

    public void startGame() {
        
        System.out.println("Let the Pokemon Card Game begin!");
            player1.beginningHand(player1);
            player2.beginningHand(player2);
            currentPlayer= player1;
            currentOpponent = player2;
                while (!isGameOver()) {
            // Display current player's turn 
                    System.out.println(currentPlayer.getName() + "'s turn:");

            // Perform turn logic (you can expand on this)
                    currentPlayer.playTurn();

            // Switch to the next player for the next turn
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                    currentOpponent = (currentOpponent == player2) ? player1 : player2;
        }

        System.out.println("Game over. Thanks for playing!");
    }

    private boolean isGameOver() {
        // Checks to see if either players hands are empty
        return player1.getDeck().isEmpty() || player2.getDeck().isEmpty();
    }

    
    public static player getCurrentOpponent() {
        return currentOpponent;
    }
    
    
}