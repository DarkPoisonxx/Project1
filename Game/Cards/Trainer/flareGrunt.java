package Game.Cards.Trainer;

import Game.Cards.Pokemon.Pokemon;

public class flareGrunt extends Trainer {
    public flareGrunt(){
    }

    public static void useFlareGrunt(Pokemon Target){
        Target.setEnergy(-1);
        Target.checkCard(Target);
        System.out.println("Took 1 energy from "+ Target.checkCard(Target));
    }
}
