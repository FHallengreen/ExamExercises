public class Main {
  public static void main(String[] args) {
    Fish fish = new Fish();
    fish.fishieLikes("Lampe".toLowerCase());
    fish.fishieLikes("Allaan".toLowerCase());
    fish.fishieLikes("Allaan".toLowerCase());
    fish.fishieLikes("Cigaretter".toLowerCase());
    fish.fishieLikes("Torsk".toLowerCase());
    System.out.println(fish.foodChecker());
  }
}