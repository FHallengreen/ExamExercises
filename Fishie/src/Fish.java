import java.util.ArrayList;

public class Fish {

  private ArrayList<String> fishyLikes = new ArrayList<>();
  int countC;
  int countA;

  public void fishieLikes(String food) {
    int countC = 0;
    int countA = 0;
    char c = 'c';
    char a = 'a';

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
      foodChecker(countA, countC);
    }
  }


  public boolean foodChecker(int countA, int countC) {
      if ((countC >= 1) || (countA >= 3)) {
        return true;
    }
    return false;
  }
}
