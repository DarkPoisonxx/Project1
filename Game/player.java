package Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Game.Cards.Card;
import Game.Cards.Energy;
import Game.Cards.Pokemon.Pokemon;
import Game.Cards.Pokemon.bulbasaur;
import Game.Cards.Pokemon.charizard;
import Game.Cards.Pokemon.pikachu;
import Game.Cards.Trainer.Trainer;
import Game.Cards.Trainer.flareGrunt;
import Game.Cards.Trainer.pokemonCollector;
import Game.Cards.Trainer.professorResearch;
public class player implements PokemonCardGame{
    Scanner inputScanner = new Scanner(System.in);
        private ArrayList<Card> deck;
        private ArrayList<Card> hand;
        private ArrayList<Card> prizePile;
        private String name;
        private Pokemon active = new Pokemon();
        private ArrayList<Pokemon> bench;
    int turn = 1;


    //constructors
    public player(){
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        new ArrayList<>();
    }
    public player(int numPokemon){
        this();

        for (int i = 0; i < numPokemon; i++) {
            deck.add(new Pokemon());
        }

        int deckSize = 60;
        for (int i = 1; i < deckSize - numPokemon; i++) {
            deck.add(new Energy());
        }
    }
    public player(int numBulbs,int numPikas,int numCharizards, int numProfResearch, int numPokemonCollector, int numFlareGrunt, String nameInput, int numEnergy){
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        new ArrayList<>();
        bench = new ArrayList<>();
        active = new Pokemon();
        name = nameInput;
        prizePile = new ArrayList<>();
        for (int i = 0; i < numBulbs; i++) {
            deck.add(new bulbasaur()); 
        }
        for (int i = 0; i < numPikas; i++) {
            deck.add(new pikachu());
        }
        for (int i = 0; i < numCharizards; i++) {
            deck.add(new charizard());
        }
        for (int i = 0; i < numProfResearch; i++) {
            deck.add(new professorResearch()); 
        }
        for (int i = 0; i < numPokemonCollector; i++) {
            deck.add(new pokemonCollector()); 
        }
        for (int i = 0; i < numFlareGrunt; i++) {
            deck.add(new flareGrunt());
        }
        for (int i = 0; i < numEnergy; i++) {
            deck.add(new Energy());
        }

        drawHand();
    }



//setters
    public void setName(String nameInput){
        this.name = nameInput;
    }

    public void setActiveBench(int i){
        this.active = this.getBench().get(i);
        getBench().remove(i);
    }
    public void setActive(int i){
        if (this.hand.get(i) instanceof Pokemon){
            this.active = (Pokemon) this.hand.get(i);
        }
        else{
            System.out.println("Not a Pokemon or wrong input");
        }
        hand.remove(i);
    }
    public void setBench(player player){
        
        boolean input = true;
        int i;

        while(evaluateOpeningHand(player) && input){
            getHand(this.hand);
            System.out.println("add which pokemon you want on your bench or type 9 to end turn:");
            i = inputScanner.nextInt();

            if(i == 9)
                input = false;
            if (i < this.hand.size() && this.hand.get(i) instanceof Pokemon){
                bench.add((Pokemon) hand.get(i));
                hand.remove(i);
            }
        }
    }
    public void setHand(Card card){
        hand.add(card);
    }

//getters
    public String getName() {
        return this.name;
    } 
    public ArrayList<Card> getDeck() {
        return new ArrayList<>(deck);
    }
    public ArrayList<Card> getHand(){
        return new ArrayList<>(hand);
    }
    public void getHand(ArrayList<Card> hand) {
        System.out.println("Current hand:");
        int i = 0;
        for (Card card : hand) {
            System.out.println( i + ": " + card.checkCard(card));
            i +=1;
        }
    }
    public ArrayList<Pokemon> getBench(){
        return new ArrayList<>(bench);
    }
    public void removeBench(int i){
        this.bench.remove(i);
    }
    public void getBench(ArrayList<Pokemon> bench) {
        System.out.println("Current bench:");
        int i = 0;

        for (Card card : bench) {
            System.out.println( i + ": " + card.checkCard(card));
            i +=1;
        }
    }
    public void getActivePokemon(){
        System.out.println("Your active pokemon " + active.checkCard(active) + " Has:");
        System.out.println(active.getHp() + " Hp");
        System.out.println(active.getEnergy()+ " Energy");
    }
    public Pokemon getActive(){
        return active;
    }

    public ArrayList<Card> getPrize(){
        return this.prizePile;
    }

    public Pokemon getTarget(player player){
       return player.getActive();
    }
    
    public void getEnergyCard(){
        int choice;
        for(int i = 0 ; i < this.getHand().size();i++){
            if(hand.get(i) instanceof Energy){
                System.out.println("Energy: " + i);
            } 
        }
        System.out.println("pick energy");
        choice = inputScanner.nextInt();

        if(choice != 9){
            this.active.setEnergy();
            hand.remove(choice);
        }
        
    }

//drawing cards
    public Card drawCard(){
        Random rng = new Random();
        int cardIndex = rng.nextInt(deck.size());
        Card drawCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        return drawCard;
    }
//draws a card and displays the card per turn
    public Card drawTurnCard(){
        Random rng = new Random();
        int cardIndex = rng.nextInt(deck.size());
        Card drawCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        System.out.println("you pulled a: " + drawCard.checkCard(drawCard));
        hand.add(drawCard);
        return drawCard;
    }
    public void drawHand(){
        for(int i = 0; i < 7; i++){
            hand.add(drawCard());
        }  
    }


//hand and discard 
    public void discardHand(){
        hand.clear(); 
        this.drawHand();
        System.out.println("hi");
    }
    public void makePrizePile(){
        for(int i = 0; i< 6;i++){
            this.prizePile.add(drawCard());
        }
    }
//evaluates if there is a pokemon
    public static boolean evaluateOpeningHand(player player1){
        ArrayList<Card> hand = player1.getHand();
        for(int i = 0; i < hand.size(); i++){
            Card currentCard = hand.get(i);
            if(currentCard instanceof Pokemon){
                return true;
            }
        }
        return false;
    }

//Turn based
    public void beginningHand(player player){
        
        int input;
        System.out.println(this.getName() + "'s turn:");
        getHand(this.hand);
        if(evaluateOpeningHand(player) == true){
            boolean isActive = false;
            
            while(!isActive){
        
                System.out.println("Choose an active Pokemon");
                 input = inputScanner.nextInt();
                    if (hand.get(input) instanceof Pokemon){
                         player.setActive((input));
                        isActive = true;
                    }
            }
        }
        System.out.println("You set " + active.checkCard(active) + " as you your active pokemon");
        makePrizePile();
        setBench(player);

    }

    public void turnChoices(int input){
        if(input == 1){
            turnComplete = true;
            active.getAttacks();
            active.attack(GameEngine.getCurrentOpponent().getActive(),active.getAttack());
            System.out.println(active.checkCard(active) + " health is at " +active.getHp()); 
            System.out.println(GameEngine.getCurrentOpponent().getActive().checkCard(GameEngine.getCurrentOpponent().getActive()) + " health is at " +GameEngine.getCurrentOpponent().getActive().getHp());
        }
        if(input == 2){
            int hasEnergy = 0; 
            while(hasEnergy >= 1){
            for(int i = 0; i < hand.size(); i++ ){
                if(hand.get(i) instanceof Energy){
                    hasEnergy += 1;
                }
                
            }       
                if (hasEnergy >= 0){
                    System.out.println("which energy would you like to use 9 to finish");
                    getEnergyCard();
                    hasEnergy -= 1;
                }
        
            }
        }
        // if(input == 3){
        //    // switch active
        // }
        if(input == 3){
            Trainer.useTrainer(this);
        }
        if(input == 4){
            setBench(this);
        }
        
    }

        public void wrongMove(){
            System.out.println("not enough energy");
            turnComplete = false;
        }

    
    boolean turnComplete = false;
    public void playTurn(){
        turnComplete = false;
        Pokemon.checkActiveStatus(GameEngine.getCurrentPlayer());
        drawTurnCard();
        
        while(!turnComplete){
        System.out.println("Active Pokemon: \n" + getActive().checkCard(active));
        getBench(this.bench);
        getHand(this.hand);
        System.out.println("attack: 1");
        System.out.println("play energy 2");
        //System.out.println("switch pokemon: 3");
        System.out.println("use trainer: 3");
        System.out.println("Place bench 4");
        int decision = inputScanner.nextInt();
        if(decision == 1)
        turnComplete = true;
        turnChoices(decision);
        turn = turn + 1 % 2;
        }
    }

    public void turnStats(){

    }
    @Override
    public void attack(Pokemon target) {
        this.active.getAttacks();
    }
    @Override
    public void discard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'discard'");
    }

    @Override
    public void player() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'player'");
    }
    @Override
    public GameEngine getCurrentOppenent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentOppenent'");
    }
    
    
}