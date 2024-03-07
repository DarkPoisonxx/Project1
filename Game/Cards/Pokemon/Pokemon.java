package Game.Cards.Pokemon;
import java.util.Scanner;

import Game.Cards.Card;
public class Pokemon extends Card {
    private int hp;
    private int energy;
    Scanner inputScanner = new Scanner(System.in);
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
    
    
    

    
}
