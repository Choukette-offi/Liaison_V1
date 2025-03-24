
public class Personne {

  private String prenom;
  private int age;
  
  //
  // Constructors
  //
  public Personne(String prenom, int age){
    this.prenom = prenom;
    this.age = age; 
  };

  /**
   * Get the value of Prenom
   * @return the value of Prenom
   */
  public String getPrenom () {
    return this.prenom;
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public boolean equals(Object object){
    if (object == null) {return false;}
    if (object == this) {return true;}
    if (!(object instanceof Personne)) {return false;}
    Personne tmp = (Personne) object;
    return tmp.prenom.equals(this.prenom) && tmp.age == this.age;
  }
}
