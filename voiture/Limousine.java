package voiture;
public class Limousine extends Voiture {
  private int longueur;
  private final int REDUC_6M = 0.05;
  private final int REDUC_BASE = 0.1;

  public Limousine(int vitesseMax, double prix, String couleur, int longueur) {
    super(vitesseMax, prix, couleur);
    this.longueur = longueur;
  }
  
  @Override
  public double calculerPrixDeVente() {
    double prixBase = super.calculerPrixDeVente();
    double prixVente = ((longueur > 6) ? 0.95 : 0.9) * prixBase;
    return prixVente;
  }
}