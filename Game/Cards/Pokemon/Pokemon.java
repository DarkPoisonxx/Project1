package Game.Cards.Pokemon;
import java.util.Scanner;
import Game.player;
import Game.Cards.Card;
public class Pokemon extends Card {
    private int hp;
    private int energy;
    static Scanner inputScanner = new Scanner(System.in);
  
    public int getHp(){
        return hp;
    }
    public int getEnergy(){
        return energy;
    }

    public void setHp(int userInputHp){
        hp = userInputHp;
    }
    public void setEnergy(){
        energy += 1;
    }
    public void setEnergy(int userInputEnergy){
        energy = userInputEnergy;
    }
    public void getAttacks() {
        
    }
    public void attack(Pokemon target,int attack){

    }
    public int getAttack(){
        int attk;
        System.out.println("Enter which attack you would like to use:");
        attk = inputScanner.nextInt();
        return attk;
    }
    public static void checkActiveStatus(player player){
        if (player.getActive().getHp() < 0){
            int replacement;
            System.out.println(player.getActive().checkCard(player.getActive()) + " is dead");
            System.out.println("please place a replacement active Pokemon from bench");
            player.getBench(player.getBench());
            replacement = inputScanner.nextInt();

        }
    }
    
    

    
}
