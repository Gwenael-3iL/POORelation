import java.text.DecimalFormat;
class Main {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat(".##");
    Forme[] figures = new Forme[3];
    figures[0] = new Carre(2); // Création d'un carré de 2 cm de coté
    figures[1] = new Cercle(3); // Création d'un cercle de 3 cm de rayon
    figures[2] = new Carre(5.2); // Création d'un carré de 5,2 cm de coté
    
    for (int i = 0; i < figures.length; i++) {
      System.out.println(figures[i] + " : surface = "
      + df.format(figures[i].getSurface()) + " cm²");
    }


    
    /*
    Personne[] personnes = new Personne[3];
    personnes[0] = new IngenieurReseau("Paul");
    personnes[1] = new IngenieurLogiciel("Philippe");
    personnes[2] = new IngenieurReseau("Pierre");
    for (int i = 0; i < personnes.length; i++) {
      personnes[i].afficher();
    }
    */

    
    // Exo 2
    //PointNom pointN = new PointNom();
    //pointN.setPointNom(5, 3, "UnPoint");
    //pointN.affCoordNom();

    //PointNom nouveauPoint = new PointNom(7, 8, "NouveauPoint");
    //nouveauPoint.afficheCoords();
    
    // Exo 1
    /*
    Point pointGeneral = new Point();
    pointGeneral.initialise(5, 3);

    PointA pointA = new PointA();
    pointA.initialise(3, 2);
    pointA.afficher();
    */
  }
}