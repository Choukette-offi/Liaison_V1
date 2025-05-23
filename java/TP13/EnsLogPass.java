import java.util.*;

public class EnsLogPass {
    private Set<LoginPassword> enspass;

    EnsLogPass(){
        this.enspass = new HashSet<>();
    }
    
    void addLogPass(LoginPassword logPass){
        enspass.add(logPass);
    }
}
