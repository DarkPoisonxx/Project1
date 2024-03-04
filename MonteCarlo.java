
import java.util.ArrayList;

import Cards.Card;
import Cards.Pokemon.Pokemon;

public class MonteCarlo extends player{
    public MonteCarlo(int numPokemon){
        super(numPokemon);
    }

    
    public boolean evaluateOpeningHand(player player1){
        ArrayList<Card> hand = player1.getHand();
        for(int i = 0; i < hand.size(); i++){
            Card currentCard = hand.get(i);
            if(currentCard instanceof Pokemon){
                return true;
            }
        }
        return false;
    }

    public boolean openingHandTest(player player1){
        drawHand();
        if(evaluateOpeningHand(player1) == true){
            return true;
        }
        return false;
    }

    public void run(player player1){    
        drawHand();
        System.out.println("Has Pokemon: " + evaluateOpeningHand(player1));
    }
}
