import java.util.ArrayList;
import java.util.Random;

import Cards.Card;
import Cards.Energy;
import Cards.Pokemon.Pokemon;
import Cards.Pokemon.bulbasaur;
import Cards.Pokemon.charizard;
import Cards.Pokemon.pikachu;
import Cards.Trainer.flareGrunt;
import Cards.Trainer.pokemonCollector;
import Cards.Trainer.professorResearch;

public class player{
    private String playerName;
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    private ArrayList<Card> discard;

    public player(){
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        discard = new ArrayList<>();
    }
    public player(int numPokemon){
        this();

        for (int i = 0; i < numPokemon; i++) {
            deck.add(new Pokemon());
        }

        int deckSize = 60;
        for (int i = 1; i < deckSize - numPokemon; i++) {
            deck.add(new Energy());
        }
    }
    public player(int numBulbs,int numPikas,int numCharizards, int numProfResearch, int numPokemonCollector, int numFlareGrunt){
        for (int i = 0; i < numBulbs; i++) {
            deck.add(new bulbasaur()); 
        }
        for (int i = 0; i < numPikas; i++) {
            deck.add(new pikachu());
        }
        for (int i = 0; i < numCharizards; i++) {
            deck.add(new charizard());
        }
        for (int i = 0; i < numProfResearch; i++) {
            deck.add(new professorResearch()); 
        }
        for (int i = 0; i < numPokemonCollector; i++) {
            deck.add(new pokemonCollector()); 
        }
        for (int i = 0; i < numFlareGrunt; i++) {
            deck.add(new flareGrunt());
        }

        drawHand();
    }

    public void discardHand(){
        Card temp = new Card();
        for(int i = 0; i < 7; i++){
            discard.add(hand.get(0));
            hand.remove(0);
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

    public ArrayList<Card> getHand(){
        return this.hand;
    }
}