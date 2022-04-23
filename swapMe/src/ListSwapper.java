import java.util.Arrays;

public class ListSwapper {

  ListContainer container = new ListContainer();
  public void swapTheLists(int [] threes, int [] fours){
    if (threes.length != fours.length){
      System.out.println("Not same length");
    }
    int[] tmp = fours;
    fours = threes;
    threes = tmp;
  }

  public void swapTwoElements(int [] array, int [] ones, int [] twos){
    System.out.println(Arrays.toString(ones) + Arrays.toString(twos));

    array = ones;
    ones = twos;
    twos = array;

    System.out.println(Arrays.toString(ones) + Arrays.toString(twos));

  }
}
