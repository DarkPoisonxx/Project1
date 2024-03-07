package Game.Cards.Pokemon;
import Game.PokemonCardGame;
@SuppressWarnings("unused")
public class charizard extends Pokemon {
    public charizard(){
        setHp(220);
        setEnergy(0);
    }

    public void fireSPin(){
      // 220
     //  discard 2 energy
    }
    public void clawSlash(){
      //  80
    }

    public void getAttacks(){
        System.out.println("Fire Spin: 1");
        System.out.println("ClawSlash: 2");
    }

    @Override
    public void attack(Pokemon target,int attack){
      
  
    }
}
