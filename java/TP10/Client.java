

/**
 * Class Client
 */
public class Client {

  //
  // Fields
  //

  private String nom;
  private String prenom;
  
  //
  // Constructors
  //
  public Client(String nom, String prenom){
    this.nom = nom; 
    this.prenom = prenom;
   };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nom
   * @param newVar the new value of nom
   */
  public void setNom (String newVar) {
    nom = newVar;
  }

  /**
   * Get the value of nom
   * @return the value of nom
   */
  public String getNom () {
    return nom;
  }

  /**
   * Set the value of prenom
   * @param newVar the new value of prenom
   */
  public void setPrenom (String newVar) {
    prenom = newVar;
  }

  /**
   * Get the value of prenom
   * @return the value of prenom
   */
  public String getPrenom () {
    return prenom;
  }

  //
  // Other methods
  //

}
