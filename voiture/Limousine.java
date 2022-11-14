/*package voiture;
public class Limousine extends Voiture {
  private int longueur;

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
}*/