package Game.Cards.Trainer;

import Game.player;
public class professorResearch extends Trainer {
    public professorResearch(){
        
    }
    public static void useProfessorResearch(player player){
        player.discardHand();
        
    }
}
