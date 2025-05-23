public class Executable {
    public static void main(String[] args) {
        LoginPassword pl1 = new LoginPassword("anglais", "paysIl");
        LoginPassword pl2 = new LoginPassword("sonia", "azerty");
        LoginPassword pl3 = new LoginPassword("anticonstitutionnellement", "bonjour");
        EnsLogPass set = new EnsLogPass();
        set.addLogPass(pl1);
        set.addLogPass(pl2);
        set.addLogPass(pl3); 
    }
}
