public class ExecutableWeekEnd{
    public static void main(String[] args) {
            WeekEnd weekEnd = new WeekEnd("2025-03-15");
            weekEnd.ajouteParticipant("Alice", 25);
            weekEnd.ajouteParticipant("Bob", 30);
            Personne alice = weekEnd.personnes.get(0);
            Personne bob = weekEnd.personnes.get(1);
            weekEnd.ajouteDepense(50.0, "Courses", alice);
            weekEnd.ajouteDepense(30.0, "Essence", bob);
            weekEnd.ajouteDepense(10.0, "Courses", bob);
            System.out.println("Total des dépenses : " + weekEnd.totalDepense());
            System.out.println("Total dépensé par Alice : " + weekEnd.totalDepense(alice));
            System.out.println("Total dépensé par Bob : " + weekEnd.totalDepense(bob));
            System.out.println("Total des dépenses en Courses : " + weekEnd.totalDepense("Courses"));
            System.out.println("Alice doit : " + weekEnd.avoirPersonne(alice));
            System.out.println("Bob doit : " + weekEnd.avoirPersonne(bob));
        }
}
    