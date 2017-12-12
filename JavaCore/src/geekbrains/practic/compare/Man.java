package geekbrains.practic.compare;

/**
 * Created by GUN
 * on 15.06.2016.
 */
public class Man implements Comparable<Man>{

    private int age;
    private String name;

    public Man() {
    }

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }


    @Override
    public int compareTo(Man o) {

//        if(age > o.age){
//            return 1;
//        }
//        if(age < o.age){
//            return -1;
//        }
//
//        return 0;

        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;

        if (age != man.age) return false;
        return !(name != null ? !name.equals(man.name) : man.name != null);

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
