public class Instruments implements Guitarr, Violin {

  public void type() {
    System.out.println("Guitar and violin are two of the instruments that I like most.");
  }
  public void name() {
    System.out.println("Btw, I am Lorgem Bosque and I really adore music.");
  }



  // interface Guitar{
  //   public void sound();
  // }
  private String type;

  public String getType(){
      return type;
  }

  public void setType(String type){
      this.type = type;
  }

  @Override
  public void sound() {    
  }

  @Override
  public void price() {
  }
 

}