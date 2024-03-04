import java.util.ArrayList;
import java.util.Random;

public class PokemonCardGame{

    private ArrayList<Card> deck;
    private ArrayList<Card> hand;

    public PokemonCardGame(int numPokemon){
        deck = new ArrayList<Card>();
        hand = new ArrayList<Card>();

        for(int i = 0; i < numPokemon; i++){
            deck.add(new Pokemon());
        }
        int deckSize = 60;
        for(int i = 1; i < deckSize - numPokemon; i++){
            deck.add(new Energy());
        }
    }

    public Card drawCard(){
        Random rng = new Random();
        int cardIndex = rng.nextInt(deck.size());
        Card drawCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        return drawCard;
    }

    public void drawHand(){
        for(int i = 0; i < 7; i++){
            hand.add(drawCard());
        }
    }

    public boolean evaluateOpeningHand(){
        for(int i = 0; i < hand.size(); i++){
            Card currentCard = hand.get(i);
            if(currentCard instanceof Pokemon){
                return true;
            }
        }
        return false;
    }

    public boolean openingHandTest(){
        drawHand();
        if(evaluateOpeningHand() == true){
            return true;
        }
        return false;
    }

    public void run(){
        drawHand();
        System.out.println("Has Pokemon: " + evaluateOpeningHand());
    }
}