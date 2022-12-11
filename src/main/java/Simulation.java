public class Simulation {
     public final int numDice;
     public final int numTosses;
     public final Dice dice;
     public final Bins bins;

     public static void main(String[] args) {
         Simulation sim = new Simulation(2, 1000000);
         sim.runSim();
         sim.printSim();
     }

     // constructor that initializes the number of dice and tosses and creates a Die and Bins object
     public Simulation(int numDice, int numTosses) {
            this.numDice = numDice;
            this.numTosses = numTosses;
            this.dice = new Dice(numDice);
            this.bins = new Bins();
     }
        // method that runs the simulation by rolling the dice and adding the results to the bins
     public void runSim() {
         for (int i = 0; i < numTosses; i++) {
             int roll = dice.roll();
              bins.add(roll);
         }
     }
        // method that prints the results of the simulation to the console
     public void printSim() {
         for (int i = numDice; i <= numDice * 6; i++) {
             //System.out.println("Number of " + i + "s: " + bins.getCount(i));
             System.out.println("Total number of rolls: " + bins.getTotal());
         }
     }
}

