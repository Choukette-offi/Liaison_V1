import java.util.List;
import java.util.ArrayList;


/**
 * Class Siege
 */
public class Siege {

  //
  // Fields
  //

  private int numeroSiege;
  private List<Reservation> reser;
  //
  // Constructors
  //
  public Siege(int numeroSiege){
    this.numeroSiege = numeroSiege;
    this.reser = new ArrayList()<>;
   };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numeroSiege
   * @param newVar the new value of numeroSiege
   */
  public void setNumeroSiege (int newVar) {
    numeroSiege = newVar;
  }

  /**
   * Get the value of numeroSiege
   * @return the value of numeroSiege
   */
  public int getNumeroSiege () {
    return numeroSiege;
  }

  /**
   * Get the List of Reservations objects held by reservationsVector
   * @return List of Reservations objects held by reservationsVector
   */
  private List<Reservation> getReservations(){
    return reser;
  }

  /**
   * @return       boolean
   * @param        date
   */
  public boolean estLibre(String date){
    
  }


}
