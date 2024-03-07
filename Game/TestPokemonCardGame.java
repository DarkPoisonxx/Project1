package Game;

public class TestPokemonCardGame
{
    public static void main(String[] args){
        player player1 = new player(15,10,10,10,5,5,"bob");
        player player2 = new player(15,10,10,10,5,5,"rick");
       GameEngine game1 = new GameEngine(player1,player2);
       game1.startGame();
    }
}
