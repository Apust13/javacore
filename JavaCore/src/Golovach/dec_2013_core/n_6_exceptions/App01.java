package Golovach.dec_2013_core.n_6_exceptions;

/**
 * Created by GUN on 12/2/2015.
 */
public class App01 {
    public static void main(String[] args) {
        System.err.println(0);
        try{
            throw new RuntimeException();
        }catch (Error err){
            System.err.println("A");
        }catch (RuntimeException e){
            System.err.println("B");
//            System.exit(0);

//            return;

        }catch (Exception ex){
            System.err.println("C");
        }finally {
            System.err.println(1);
        }

        System.err.println(2);


    }


}
