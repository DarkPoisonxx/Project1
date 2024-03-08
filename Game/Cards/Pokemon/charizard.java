package Game.Cards.Pokemon;
import Game.PokemonCardGame;
@SuppressWarnings("unused")
public class charizard extends Pokemon {
    public charizard(){
        setHp(220);
        setEnergy(0);
    }

    public void fireSpin(Pokemon target){
      if(this.getEnergy() >= 2){
        target.setHp(target.getHp() - 220);
        this.setEnergy(this.getEnergy() - 2);
      }
     

    }
    public void clawSlash(Pokemon target){
      target.setHp(target.getHp() - 220);
    }

    public void getAttacks(){
        System.out.println("Fire Spin: 1");
        System.out.println("ClawSlash: 2");
    }
    

    public void attack(Pokemon target,int attack){
      if(attack == 1)
      fireSpin(target);
      if(attack==2)
      clawSlash(target);

  }
}
