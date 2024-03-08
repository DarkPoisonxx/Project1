package Game.Cards.Trainer;
import java.util.Scanner;

import Game.player;
import Game.Cards.Card;
public class Trainer extends Card{
     
     public Trainer(){

     }
     public static void useTrainer(player player){
          try (Scanner inputScanner = new Scanner(System.in)) {
               int choice;
       for(int i = 0 ; i < player.getHand().size();i++){
                 if(player.getHand().get(i) instanceof flareGrunt){
                     System.out.println("Flare Grunt: " + i);
                 } 
                 if(player.getHand().get(i) instanceof pokemonCollector){
                    System.out.println("Pokemon Collector: " + i);
                } 
                if(player.getHand().get(i) instanceof professorResearch){
                    System.out.println("Professors Research: " + i);
                } 
       }
               System.out.println("pick trainer");
               choice = inputScanner.nextInt();
               if(player.getHand().get(choice)instanceof flareGrunt)
                    flareGrunt.useFlareGrunt(player.getTarget(player));
               if(player.getHand().get(choice)instanceof pokemonCollector)
                    pokemonCollector.usePokemonCollector(player);
               if(player.getHand().get(choice)instanceof professorResearch)
                    professorResearch.useProfessorResearch(player);
               player.getHand().remove(choice);
          }
     }
}