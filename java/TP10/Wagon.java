
import java.util.List;
import java.util.ArrayList;
/**
 * Class Wagon
 */
public class Wagon {

  //
  // Fields
  //

  private int classe;
  private int numeroWagon;
  private List<Siege> lssiege;
  
  //
  // Constructors
  //
  public Wagon(int classe, int numeroWagon){
    this.classe = classe;
    this.numeroWagon = numeroWagon;
    this.lssiege = new ArrayList<>();
   };

  //
  // Accessor methods
  //

  /**
   * Set the value of classe
   * @param newVar the new value of classe
   */
  public void setClasse (int newVar) {
    classe = newVar;
  }

  /**
   * Set the value of numeroWagon
   * @param newVar the new value of numeroWagon
   */
  public void setNumeroWagon (int newVar) {
    numeroWagon = newVar;
  }

  public int getClasse() {
      return classe;
  }

  /**
   * Get the value of numeroWagon
   * @return the value of numeroWagon
   */
  public int getNumeroWagon () {
    return numeroWagon;
  }

  /**
   * Add a Siege object to the siegeVector List
   */

  public void addSiege (Siege new_object) {
    lssiege.add(new_object);
  }

  /**
   * Get the List of Siege objects held by siegeVector
   * @return List of Siege objects held by siegeVector
   */
  public List<Siege> getSieges(){
    return lssiege;
  }

  /**
   * @param        date
   */
  public List<Siege>  getSiegeLibre(String date){
    List<Siege> rep;
    rep = new ArrayList<>();
    for(Siege siege: lssiege){
      if(siege.estLibre(date)){
        rep.add(siege);
      }
    }
    return rep;
  }
}
