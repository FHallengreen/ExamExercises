import java.util.ArrayList;

public class Fish {

private ArrayList <String> fishyLikes= new ArrayList<>();

  public void fishieLikes(String food) {

    int countC = 0;
    int countA = 0;

    for (int i = 0; i < food.length(); i++) {
      if (food.charAt(i) == 'c') {
        countC++;
      }
      if (food.charAt(i) == 'a') {
        countA++;
      }
    }
    if (countA >= 3 || countC >= 1) {
      fishyLikes.add(food);
    }
  }


  public boolean foodChecker() {
    int countC = 0;
    int countA = 0;
    for (int i = 0; i < fishyLikes.size(); i++) {
      String firstFish = fishyLikes.get(i).toLowerCase();
      for (int j = 0; j < firstFish.length(); j++) {
        if (firstFish.indexOf(i) == 'c') {
          countC++;
        } else if (firstFish.indexOf(i) == 'a') {
          countA++;
        }
        if ((countC > 1) || (countA > 3)) {
          return false;
        }
      }
      countA = 0;
      countC = 0;
    }
    return true;
  }
}

