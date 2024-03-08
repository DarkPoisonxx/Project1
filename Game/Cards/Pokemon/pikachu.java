package Game.Cards.Pokemon;
public class pikachu extends Pokemon{
    public pikachu(){
        setHp(70);
        setEnergy(0);
    }

    public void quickAttack(Pokemon unfortunatePokemon){
        //deals 10 damage
        int currentHp = unfortunatePokemon.getHp();
        int resultingHp = currentHp - 10;
        unfortunatePokemon.setHp(resultingHp);
    }

    public void electroBall(Pokemon target){
        //deals 60 damage
    }

    public void getAttacks(){
        System.out.println("Quick Attack: 1");
        System.out.println("Electro Ball: 2");
    }

    public void attack(Pokemon target,int attack){
        if(attack == 1)
      quickAttack(target);
      if(attack==2)
      electroBall(target);
    }
}