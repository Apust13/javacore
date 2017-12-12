package geekbrains.practic.compare;

import java.util.Comparator;

/**
 * Created by GUN
 * on 15.06.2016.
 */
public class NewComparator implements Comparator<Man> {
    @Override
    public int compare(Man o1, Man o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }
        if(o1.getAge() < o2.getAge()){
            return -1;
        }
        return 0;
    }
}
