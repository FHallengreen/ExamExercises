public class Cat {
  private int height;
  private int width;
  private int weight;
  private boolean isBaby; //if false = adult.
  boolean isSneaky;

  public Cat (int height, int width, int weight, boolean isBaby){
    this.height = height;
    this.width = width;
    this.weight = weight;
    this.isBaby = isBaby;
  }

  public void isSneaky(Cat cat){

    if (cat.height <= 50 && cat.width <= 30 && !cat.isBaby){
      isSneaky = true;
    }
    else if (cat.weight <= 20 && !cat.isBaby){
      isSneaky = true;
    }
    else if (cat.isBaby){
      isSneaky = true;
    }else isSneaky = false;
  }

  public void isCatSneaky(Cat cat){
    isSneaky(cat);
    if (isSneaky){
      for (int i = 0; i < 100; i++) {
        System.out.println(i);
      }
    }
    else System.out.println("Not Sneaky!");
  }
}
