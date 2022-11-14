package formeEx;
public class Carre extends Forme implements Affichable {
  private double cote;

  public Carre(double cote) {
    this.cote = cote;
  }
  
  @Override
  public double getSurface() {
    return cote * cote;
  }


  
  /*
  private double cote;

  public Carre(double cote) {
    this.cote = cote;
    setSurface(calculSurface());
  }

  @Override
  public double calculSurface() {
    return cote*cote;
  }

  @Override
  public void setSurface(double surface) {
    super.setSurface(surface);
  }

  @Override
  public double getSurface() {
    return super.getSurface();
  }
  */
}