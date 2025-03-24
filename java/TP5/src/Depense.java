/**
 * Class Depense
 */
public class Depense {
  private double montant;
  private String article;
  private Personne payeur;
  
  public Depense(Personne personne, double montant, String article){
    this.payeur = personne;
    this.montant = montant;
    this.article = article;
  }

  /**
   * Get the value of article
   * @return the value of article
   */
  public String getArticle(){
    return this.article;
  }

  /**
   * Get the value of prix
   * @return the value of prix
   */
  public double getMontant(){
    return this.montant;
  }

  public Personne getPersonne(){
    return this.payeur;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(montant);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((article == null) ? 0 : article.hashCode());
    result = prime * result + ((payeur == null) ? 0 : payeur.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (obj == null)
      return false;

    if (getClass() != obj.getClass())
      return false;
      
    Depense other = (Depense) obj;
    if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
      return false;
    if (article == null) {
      if (other.article != null)
        return false;
    } else if (!article.equals(other.article))
      return false;
    if (payeur == null) {
      if (other.payeur != null)
        return false;
    } else if (!payeur.equals(other.payeur))
      return false;
    return true;
  }
  

}
