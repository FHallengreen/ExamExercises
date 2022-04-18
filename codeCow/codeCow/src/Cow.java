import java.util.ArrayList;
import java.util.Collections;

public class Cow {
  private ArrayList <String> foodSource = new ArrayList<>();

  public void addFoodSource(String food){
    if (!(food.substring(0,1).contains("A")) && (!(foodSource.contains(food)))){
      foodSource.add(food);
      }
  }

  public ArrayList<String> printFoodSources(){
    Collections.reverse(foodSource);
    return foodSource;
  }

}
