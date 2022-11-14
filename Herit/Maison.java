public class Maison extends Batiment {
  private int nbPieces;
  private double surfaceJardin;

  public Maison(String adresse, double surfaceH, double surfaceJ, int nbPieces) {
    super(adresse, surfaceH);
    this.surfaceJardin = surfaceJ;
    this.nbPieces = nbPieces;
  }

  public double getSurfaceJardin() {
    return this.surfaceJardin;
  }
  
  @Override
  public String toString() {
    return suprer.toString() + "\nSurface Jardin : " + surfaceJardin + "\nNb Piece : " + nbPiece;
  }
}