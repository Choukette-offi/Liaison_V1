public class Personne implements Comparable<Personne>{
    private String nom;
    private int age;

    public Personne(String nom,  int age){
        this.nom = nom;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public int compareTo(Personne p1){
    if (p1.age > this.age)
        return -1;
    if (p1.age < this.age)
        return 1;
    return 0;
    }
}