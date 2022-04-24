import java.util.Arrays;

public class SelectionSort {

  private int[] array;

  public SelectionSort(int[] array) {
    this.array = array;
  }


  public int[] sort() {
    int tmp = 0;
    for (int j = 0; j < array.length; j++) {
      int minValue = array[j];
      int minIndex = j;
      for (int i = j; i < array.length; i++) {
        if (array[i] < minValue) {
          minValue = array[i];
          minIndex = i;
        }
      }
      tmp = array[j];
      array[j] = array[minIndex];
      array[minIndex] = tmp;
        }
    return array;
  }

  public void printArray(){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println(Arrays.toString(sort()));
  }

  public static void main(String[] args) {
    int[] array = { 10,8,2,3,5,1,9,7,4,6};

    SelectionSort selectionSort = new SelectionSort(array);
    selectionSort.printArray();

  }

}