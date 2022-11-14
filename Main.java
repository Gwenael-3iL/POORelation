class Main {
  public static void main(String[] args) {
    Personne[] personnes = new Personne[3];
    personnes[0] = new IngenieurReseau("Paul");
    personnes[1] = new IngenieurLogiciel("Philippe");
    personnes[2] = new IngenieurReseau("Pierre");
    for (int i = 0; i < personnes.length; i++) {
      personnes[i].afficher();
    }
    

    
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