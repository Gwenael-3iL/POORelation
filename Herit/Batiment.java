public class Batiment {
  private String adresse;
  private double surfaceHabitable;

  public Batiment(String adresse, double surfaceHabitable) {
    this.adresse = adresse;
    this.surfaceHabitable = surfaceHabitable;
  }

  public double getSurfaceHabitable() {
    return this.surfaceHabitable;
  }
  
  @Override
  public String toString() {
    return "Adresse : " + adresse + "\nSurface Habitable : " + surfaceHabitable;
  }
}