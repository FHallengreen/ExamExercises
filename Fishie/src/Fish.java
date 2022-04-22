import java.util.ArrayList;

public class Fish {

  private ArrayList<String> fishyLikes = new ArrayList<>();

  public void fishieLikes(String food) {
      if (food.contains("c")) {
        fishyLikes.add(food);
        foodChecker();
      } else if ((food.contains("a"))) {
        fishyLikes.add(food);
        foodChecker();
      }
      System.out.println(fishyLikes);
    }


  public boolean foodChecker() {
    for (int i = 0; i < fishyLikes.size(); i++) {
      if (fishyLikes.indexOf("c") >= 1 || (fishyLikes.indexOf("a") > 3)) {
        return false;
      }
    }
    return true;
  }
}
