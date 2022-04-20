public class Train {

  private TrainRail trainRail;
  private int amountOfPassengers;
  private int amountOfWagons;

  public Train(TrainRail trainRail, int amountOfPassengers, int amountOfWagons) {
    this.trainRail = trainRail;
    this.amountOfPassengers = amountOfPassengers;
    this.amountOfWagons = amountOfWagons;
  }


  public String ridingTheRail(){
    if (!tooManyPassengers()){
    return "Train not leaving";
    }
    for (int i = 0; i < trainRail.getRailLength(); i++) {
      System.out.println("Chuchuuuu");
    }
    return "";
  }

  public boolean tooManyPassengers(){
    if (amountOfPassengers > amountOfWagons){
      return false;
    }
    return true;
  }
}
