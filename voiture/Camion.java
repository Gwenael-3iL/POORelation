package voiture;
public class Camion extends Voiture {
  private int poids;
  private final double REDUC_BASE = 0.02;
  private final double REDUC_POIDS = 0.01;

  public Camion(int vitesseMax, double prixBase, String couleur, int poids) {
    super(vitesseMax, prixBase, couleur);
    this.poids = poids;
  }
  
  @Override
  public double calculerPrixDeVente() {
    double prixBase = super.calculerPrixDeVente();
    double prixVente = ((poids > 2000) ? 0.9 : 0.8) * prixBase;
    return prixVente;
  }
}