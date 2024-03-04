public class bulbasaur extends Pokemon{
    public bulbasaur(){
        setHp(70);
    }

    public void leechSeed(Pokemon target){

        int currentHp = target.getHp();
        int resultingHp = currentHp - 20;

        int thisCurrentHp = this.getHp();
        if (thisCurrentHp + 20 > 70){
            this.setHp(70); 
        }
        else
        this.setHp(thisCurrentHp + 20);

        target.setHp(resultingHp);
    }
}