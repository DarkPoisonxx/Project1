package Cards.Pokemon;
import Cards.Card;

public class Pokemon extends Card{
    private int hp;
    private int energy;

    public int getHp(){
        return hp;
    }

    public void setHp(int userInputHp){
        hp = userInputHp;
    }
    public void setEnergy(int userInputEnergy){
        energy = userInputEnergy;
    }
}
