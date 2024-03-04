public class bulbasaur extends Pokemon{

    public bulbasaur(){
        setHp(70);
    }

    public void leechSeed(Pokemon target){

        int currentHp = target.getHp();
        int resultingHp = currentHp - 20;

        int thisCurrentHp = this.getHp();
        this.setHp(resultingHp);

        target.setHp(resultingHp);
    }
}