import java.util.ArrayList;

public class Fish {

  private ArrayList<String> fishyLikes = new ArrayList<>();

  public void fishieLikes(String food) {
    char c = 'c';
    int countC = 0;
    char a = 'a';
    int countA = 0;

    for (int i = 0; i < food.length(); i++) {
      if (food.charAt(i) == c) {
        countC++;
      }
      if (food.charAt(i) == a) {
        countA++;
      }
    }
    if (countA >= 3 || countC >= 1) {
      fishyLikes.add(food);
      System.out.println(fishyLikes);
      System.out.println(foodChecker());
    }
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
