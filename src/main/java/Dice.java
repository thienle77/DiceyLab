import java.util.Random;

public class Dice {
    int numDice;
    int sides = 6;

    public Dice(int numDice) {
        this.numDice = numDice;
    }

    public Integer roll (){
        Random random = new Random();
        int sum = 0;
        for(int i = 0; i < numDice; i++){
            sum += random.nextInt(sides)+ 1;
        }
        return sum;
    }
}