package Game.Cards.Trainer;

import java.util.Random;

import Game.player;
import Game.Cards.Card;
import Game.Cards.Pokemon.Pokemon;

public class pokemonCollector extends Trainer {
    public pokemonCollector(){
    }

    public static void usePokemonCollector(player player){
        int counter = 0;
        System.out.println("hi");
        while(counter < 3){
            Random rng = new Random();
            int cardIndex = rng.nextInt(player.getDeck().size());
            Card drawCard = new Card();
            if(player.getDeck().get(cardIndex) instanceof Pokemon){
                
                drawCard = player.getDeck().get(cardIndex);
                player.setHand(drawCard);
                player.getDeck().remove(cardIndex);
            }
            counter +=1;
        }
        }
    }

    
