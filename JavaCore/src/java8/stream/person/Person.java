package java8.stream.person;

/**
 * Created by APUST on 10/29/2017.
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "  " + age;
    }
}
