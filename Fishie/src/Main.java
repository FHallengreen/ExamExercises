public class Main {
  public static void main(String[] args) {
    Fish fish = new Fish();
    fish.fishieLikes("Allaan");
    fish.fishieLikes("Allaan");
    fish.fishieLikes("Cigaretter");
    fish.fishieLikes("Torsk");
    fish.fishieLikes("Lampe");
    System.out.println(fish.foodChecker());
  }
}