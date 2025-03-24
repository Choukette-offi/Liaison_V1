
import java.util.List;
import java.util.ArrayList;


/**
 * Class WeekEnd
 */
public class WeekEnd {
  private String dateDuWeekEnd;
  private List<Personne> participants;
  private List<Depense> lesDepenses;
  
  public WeekEnd(String date){ 
    this.dateDuWeekEnd = date;
    this.participants = new ArrayList<>();
    this.lesDepenses = new ArrayList<>();
  };

  /**
   * Get the value of date
   * @return the value of date
   */
  public String getDate(){
    return this.dateDuWeekEnd;
  }

  /**
   */
  public void ajouteParticipant(String nom, int age){
    Personne participant = new Personne(nom, age);
    participants.add(participant);
  }


  /**
   */
  public void ajouteDepense(int montant, String article, Personne personne){
    Depense depense = new Depense(personne, montant, article);
    lesDepenses.add(depense);
  }


  /**
   * @return toute les depenses d'une personne.
   */
  public double totalDepense(Personne personne){
    double total = 0;
    for(Depense depense : this.lesDepenses){
      if(depense.getPersonne().equals(personne)){
        total += depense.getMontant();
      }
    }
    return total;
  }


  /**
   * @return       double
   */
  public double totalDepense(){
    double total = 0;
    for(Depense prix: this.lesDepenses){
      total += prix.getMontant();
    }
    return total;
  }


  /**
   * @return       double
   * @param        article
   */
  public double totalDepense(String article){
    double total = 0;
    for(Depense art: lesDepenses){
      if(art.getArticle().equals(article)){
        total += art.getMontant();
      }
    }
    return total;
  }


  /**
   * @return       double
   * @param        participant
   */
  public double avoirPersonne(Personne participant){
    if(this.participants.size() > 0){
      double moyenne = totalDepense() / this.participants.size();
      return (totalDepense(participant) - moyenne);
      }
      return 0;
    }
}
