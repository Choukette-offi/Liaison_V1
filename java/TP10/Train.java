
import java.util.List;
import java.util.ArrayList;
/**
 * Class Train
 */
public class Train {

  //
  // Fields
  //

  private String nomTrain;
  private List<Wagon> lswagon;
  
  //
  // Constructors
  //
  public Train(String nom){
    this.nomTrain = nom;
    this.lswagon = new ArrayList<>();
   };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nomTrain
   * @param newVar the new value of nomTrain
   */
  public void setNomTrain (String newVar) {
    nomTrain = newVar;
  }

  /**
   * Get the value of nomTrain
   * @return the value of nomTrain
   */
  public String getNomTrain() {
    return nomTrain;
  }

  /**
   * Add a Wagon object to the wagonVector List
   */
  public void addWagon(Wagon numero) {
    lswagon.add(numero);
  }

  //
  // Other methods
  //

  /**
   * @return       Siege[*]
   * @param        date
   */
  public List<Siege> getSiegeLibre(String date, int classe){
    List<Siege> rep = new ArrayList<>();
    for(Wagon wagon: lswagon){
      if(wagon.getClasse()==classe){
        rep.addAll(wagon.getSiegesLibre(date));
      }
    }
    return rep;
  }

  public reservation(){
    
  }

  /**
   */
  public Wagon getWagons(int numero){
    return lswagon.get(numero);
  }


}
