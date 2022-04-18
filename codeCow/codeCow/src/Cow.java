import java.util.ArrayList;

public class Cow {
  private ArrayList <String> foodSource = new ArrayList<>();

  public void addFoodSource(String food){
      if (!(foodSource.contains(food))){
        foodSource.add(food);
      }
  }

  public ArrayList<String> printFoodSources(){
    return foodSource;
  }

}
