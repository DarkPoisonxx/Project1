public class Pikachu extends Pokemon{
    public pikachu(){
        setHp(70);    
    }

    public void quickAttack(Pokemon unfortunatePokemon){
        //deals 10 damage
        int currentHp = unfortunatePokemon.getHp();
        int resultingHp = currentHp - 10;
        unfortunatePokemon.setHp(resultingHp);
    }

    public void electroBall(){
        //deals 60 damage
    }

}