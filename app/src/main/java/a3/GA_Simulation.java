package a3;

import java.util.ArrayList;
import java.util.Comparator;

public class GA_Simulation {

  // Use the instructions to identify the class variables, constructors, and methods you need

  /** Sorts population by fitness score, best first 
   * @param pop: ArrayList of Individuals in the current generation
   * @return: Nothing. ArrayList is sorted in place
  */
    public void rankPopulation(ArrayList<Individual> pop) {
        // sort population by fitness
        Comparator<Individual> ranker = new Comparator<>() {
          // this order will sort higher scores at the front
          public int compare(Individual c1, Individual c2) {
            return (int)Math.signum(c2.getFitness()-c1.getFitness());
          }
        };
        pop.sort(ranker); 
      }
}
