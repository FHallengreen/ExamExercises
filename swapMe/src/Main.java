public class Main {
  public static void main(String[] args) {
    ListSwapper swap = new ListSwapper();
    ListContainer container = new ListContainer();
    swap.swapTheLists(new int[]{3, 3, 3, 3, 3}, new int[]{4, 4, 4, 4, 4});
    swap.swapTwoElements(new int[10],swap.container.getOnes(), swap.container.getTwos());
  }
}