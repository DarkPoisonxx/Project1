package Game.Cards;
import Game.Cards.Pokemon.Pokemon;
public class Energy extends Card{
    public Energy(){
    }

    public static void playEnergy(Pokemon target){
        target.setEnergy();
        System.out.println("Current Energy: "+ target.getEnergy());;
    }
}