package Game.Cards;

import Game.Cards.Pokemon.bulbasaur;
import Game.Cards.Pokemon.charizard;
import Game.Cards.Pokemon.pikachu;
import Game.Cards.Trainer.flareGrunt;
import Game.Cards.Trainer.pokemonCollector;
import Game.Cards.Trainer.professorResearch;

public class Card{
    public Card(){
        
    }
    public String checkCard(Card card){
            if(card instanceof professorResearch)
            return"Professor's Research";
            if(card instanceof charizard)
            return"Charizard";
            if(card instanceof pikachu)
            return"Pikachu";
            if(card instanceof bulbasaur)
            return"Bulbasaur";
            if(card instanceof Energy)
            return"Energy";
            if(card instanceof flareGrunt)
            return"Flare Grunt";
            if(card instanceof pokemonCollector)
            return"Pokemon Collector";
        return null;
    }
}