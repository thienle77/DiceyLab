import java.util.HashMap;

public class Bins {
    HashMap<Integer, Integer> binsTracker;

    // constructor that initializes the bins as a HashMap
    public Bins() {
       this.binsTracker = new HashMap<>();
    }

     // adds a roll to the appropriate bin
     public void add(int roll) {
        if (!binsTracker.containsKey(roll)) {
            binsTracker.put(roll, 0);
        }
     }
        //returns the number of rolls in a given bin
     public int getCount(int roll) {
        if (!binsTracker.containsKey(roll)) {
            return 0;
        }
         Integer totalRolls = 0;
         return binsTracker.get(totalRolls);
     }
     //returns the total number of rolls
     public int getTotal() {
         int total = 0;
         for (int count : binsTracker.values()) {
             total += count;

         }   return total;
     }
}

