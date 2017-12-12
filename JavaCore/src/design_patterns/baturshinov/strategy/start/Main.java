package design_patterns.baturshinov.strategy.start;


import design_patterns.baturshinov.strategy.auth.UserChecker;
import design_patterns.baturshinov.strategy.strategy.DBAuth;
import design_patterns.baturshinov.strategy.strategy.FileAuth;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
