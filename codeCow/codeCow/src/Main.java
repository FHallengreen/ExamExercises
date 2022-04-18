public class Main {

  public static void main(String[] args) {
  Cow obj = new Cow();
  obj.addFoodSource("Ærter");
  obj.addFoodSource("Korn");
  obj.addFoodSource("Vand");
  obj.addFoodSource("Ananas");
    System.out.println(obj.printFoodSources());
  }
}
