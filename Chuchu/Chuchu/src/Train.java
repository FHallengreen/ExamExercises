public class Train {

  private int trainRail;
  private int amountOfPassengers;
  private int amountOfWagons;

  public Train(int trainRail, int amountOfPassengers, int amountOfWagons) {
    this.trainRail = trainRail;
    this.amountOfPassengers = amountOfPassengers;
    this.amountOfWagons = amountOfWagons;
  }


  public String ridingTheRail(){
    if (tooManyPassengers()){
    return "Train not leaving";
    }
    return "Chuuuchuuu";
  }

  public boolean tooManyPassengers(){
    if (amountOfPassengers > amountOfWagons){
      return false;
    }
    return true;
  }

}
