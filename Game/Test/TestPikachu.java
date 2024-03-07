package Game.Test;
import Game.Cards.Pokemon.bulbasaur;
import Game.Cards.Pokemon.pikachu;

public class TestPikachu{
    public static void main(String[] args){
        pikachu pikaMain = new pikachu();
        pikachu pikaTarget = new pikachu();
        bulbasaur newBulb = new bulbasaur();

        System.out.println("Bulbasaur use leech seed");
            newBulb.leechSeed(pikaMain);
        System.out.println("Pika Main Hp: " + pikaTarget.getHp() + "Bulbasaur Hp: " + newBulb.getHp());

        pikaMain.quickAttack(newBulb);
        
        while(pikaTarget.getHp() > 0){
            System.out.println("Pikachu use Quick Attack");
                pikaMain.quickAttack(pikaTarget);
            System.out.println("Pika Target Hp: " + pikaTarget.getHp());
        }
    }
}