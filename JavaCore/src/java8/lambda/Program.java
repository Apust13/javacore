package java8.lambda;

/**
 * Created by APUST on 1/31/2017.
 */

import static java.lang.System.out;
public class Program {

    public static void alarm(Object sender) {
    out.println("ALARM!!!");
    }

    public static void main(String[] args){
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        sw.addConsumer(lamp);
        sw.addConsumer(radio);

        class TvSet implements ElectricityConsumer{
            @Override
            public void turnOn(Object sender) {
               out.println("TV is turn ON!!!");
            }
        }
        sw.addConsumer(new TvSet());

        sw.addConsumer(
            new ElectricityConsumer() {
            public void turnOn(Object sender) {
                out.println("Bass is swing!!!");
            }
        });

        sw.addConsumer( (Object sender) -> out.println("Mixer is working!!") );
        sw.addConsumer( sender -> out.println("Lambda!!") );
        sw.addConsumer( sender -> {
            out.println("Lambda!!");
            out.println("WORKING LAMBDA!");
        } );
        //sw.addConsumer(s -> Program.alarm(s));
        sw.addConsumer(Program::alarm);



        sw.switchOn();
    }


}
