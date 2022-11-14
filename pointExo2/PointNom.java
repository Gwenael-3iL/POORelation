package pointExo2;
public class PointNom extends Point {
  private String nom;
  
  public PointNom(int x, int y, String nom) {
    super.setPoint(x, y);
    setNom(nom);
  }
  
  public void setPointNom(int x, int y, String nom) {
    super.setPoint(x, y);
    setNom(nom);
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void affCoordNom() {
    this.afficheCoords();
    System.out.println("Nom : " + this.nom);
  }

  @Override
  public void afficheCoords() {
    super.afficheCoords();
    System.out.println("Nom : " + this.nom);
  }
}