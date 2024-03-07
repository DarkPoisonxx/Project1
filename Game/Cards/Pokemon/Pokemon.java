package Game.Cards.Pokemon;
import Game.PokemonCardGame;
import Game.Cards.Card;
public class Pokemon extends Card {
    private int hp;
    private int energy;
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
    public void attack(Pokemon target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    
    
    

    
}
