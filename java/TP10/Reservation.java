
/**
 * Class Reservation
 */
public class Reservation {
  private String date;
  private Client m_client;
  
  //
  // Constructors
  //
  public Reservation(String date, Client m_client){
    this.date = date;
    this.m_client = m_client;
   };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of date
   * @param newVar the new value of date
   */
  public void setDate (String newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * @return the value of date
   */
  public String getDate(){
    return date;
  }

  /**
   * Set the value of m_client
   * @param newVar the new value of m_client
   */
  private void setClient (Client newVar) {
    m_client = newVar;
  }

  /**
   * Get the value of m_client
   * @return the value of m_client
   */
  private Client getClient () {
    return m_client;
  }
}
