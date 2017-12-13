package com.apust.design_patterns.baturshinov.strategy.start;


import com.apust.design_patterns.baturshinov.strategy.auth.UserChecker;
import com.apust.design_patterns.baturshinov.strategy.strategy.DBAuth;
import com.apust.design_patterns.baturshinov.strategy.strategy.FileAuth;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
