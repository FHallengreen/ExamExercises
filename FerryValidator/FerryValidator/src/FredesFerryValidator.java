import java.util.ArrayList;

public class FredesFerryValidator {

  private ArrayList <Integer> maxWeight = new ArrayList<>();

  public boolean wantsToBang(int weight){
    if (weight >= 140 ){ // minimum weight 140 kg!
      return true;
    }
    return false;
  }

  public void iBangTheseBitches (int weight){

    int maxWeightAllowed = 0;
    for (int i = 0; i < maxWeight.size(); i++) {
      maxWeightAllowed += maxWeight.get(i);
    }
    if (maxWeightAllowed >= 1000){
      System.out.println("You have reached the weight limit!");
    }
    else if (wantsToBang(weight)){
      maxWeight.add(weight);
      System.out.println(maxWeight);
      System.out.println("Totalvægten er nu: " + maxWeightAllowed);
    }
    else System.out.println("She's too light!");
  }



}
