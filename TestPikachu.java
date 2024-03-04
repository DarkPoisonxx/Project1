public class TestPikachu{
    public static void main(String[] args){
        Pikachu pikaMain = new pikachu();
        Pikachu pikaTarget = new pikachu();
        Bulbasaur newBulb = new bulbasaur();

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