package saburov.reflection;

/**
 * Created by APUST on 3/15/2017.
 */
public class Main {

    public static void main(String[] args) {

        PasswordGeneratorFirst pgf = new PasswordGeneratorFirst();
        String passw =pgf.generate();
        System.out.println(passw);

    }
}
