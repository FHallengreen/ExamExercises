public class Cat {
  private int height;
  private int width;
  private int weight;
  private boolean isBaby; //if false = adult.

  public Cat(int height, int width, int weight, boolean isBaby) {
    this.height = height;
    this.width = width;
    this.weight = weight;
    this.isBaby = isBaby;
  }

  public boolean isSneaky() {

    if (height <= 50 && width <= 30 && !isBaby) {
      return true;
    } else if (weight <= 20 && !isBaby) {
      return true;
    } else if (isBaby) {
      return true;
    } else return false;
  }

  public void isCatSneaky() {
    isSneaky();
    if (isSneaky()) {
      for (int i = 0; i < 100; i++) {
        System.out.println(i);
      }
    } else System.out.println("Not Sneaky!");
  }
}
