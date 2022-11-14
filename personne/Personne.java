package personne;
public class Personne {
  private String prenom;

  public Personne(String prenom) {
    this.prenom = prenom;
  }

  public void afficher() {
    System.out.println(prenom);
  }
}