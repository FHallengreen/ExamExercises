import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cow {
  private ArrayList <String> foodSource = new ArrayList<>();

  public void addFoodSource(String food){
    if (!(food.substring(0,1).contains("A")) && (!(foodSource.contains(food)))){
      foodSource.add(food);
      }
  }

  public void printFoodSources(){
    Collections.reverse(foodSource);
    for (int i = 0; i < foodSource.size(); i=i+2) {
      System.out.println(foodSource.get(i));
    }
  }
}
