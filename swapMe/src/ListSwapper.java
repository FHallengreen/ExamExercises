import java.util.Arrays;

public class ListSwapper {

  ListContainer container = new ListContainer();

  public void swapTwoElements(int [] array, int a, int b){
    for (int i = 0; i < array.length; i++) {
      array[i] = i+1;
    }
    System.out.println(Arrays.toString(array));
    for (int i = 0; i < array.length; i++) {
      if (array[i] == a){
        array[i] = b;
      }
      else if ((array[i] == b)){
        array[i] = a;
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
