package Game.Test;


import java.text.DecimalFormat;
public class TestBestNumPokemon 
{
    public static void main(String[] args){
        for(int i = 1; i <= 60; i++){
        int iteration = 1;
        int iterations = 1000000;
        int goodHands = 0;
        int numPokemon = i;
        double rawPercentChance = 0;

        // this runs one test with however many pokemon you want to test
        // MonteCarlo test1 = new MonteCarlo(numPokemon);
        // test1.run(test1);

        while(iteration <= iterations){
            MonteCarlo test = new MonteCarlo(numPokemon);
            if(test.openingHandTest(test) == true){
                goodHands +=1;
            }
            iteration += 1;
        }
     //   System.out.println("There were " + goodHands + " good hands with " + numPokemon +" pokemon in " + iterations + " decks");
        rawPercentChance = 100 * ((double)goodHands / (double)iterations);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String percentChance = decimalFormat.format(rawPercentChance);
        System.out.println("This gives you a " + percentChance + "% chance to get a good hand with " + numPokemon + " pokemon");
       // System.out.println("With " + numPokemon + " Pokemon " + percentChance + "%");
    }
}
}