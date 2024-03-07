package Game;
import java.util.ArrayList;

import Game.Cards.Card;
import Game.Cards.Pokemon.Pokemon;

public interface PokemonCardGame {
     void attack(Pokemon target);
    
    Card drawCard();
    Card drawTurnCard();
    void drawHand();
    void discardHand();
    void discard();
    ArrayList<Pokemon> getBench();
    void player();
    void getActive();
    GameEngine getCurrentOppenent();
}
