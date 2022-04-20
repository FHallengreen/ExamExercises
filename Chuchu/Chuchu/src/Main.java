public class Main {
  public static void main(String[] args) {

    Train train1 = new Train(new TrainRail(3),4,4);
    System.out.println(train1.ridingTheRail());
  }
}