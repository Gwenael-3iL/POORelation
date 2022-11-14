package formeEx;
public class Cercle extends Forme implements Affichable {
  private double rayon;

  public Cicle(double rayon) {
    this.rayon = rayon;
  }

  @Override
  public double getSurface() {
    return Math.PI * rayon * rayon
  }
  
  /*
  private double rayon;

  public Cercle(double rayon) {
    setSurface(calculSurface());
    this.rayon = rayon;
  }

  @Override
  public double calculSurface() {
    return Math.PI * rayon * rayon;
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