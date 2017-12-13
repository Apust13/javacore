package com.apust.Golovach.feb_2013_core.collection_n2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GUN
 * on 24.06.2016.
 */
public class App01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add(new String("A"));
        list.add(new String("B"));

        String str = new String("B");

        System.out.println("-----------------------");
        System.out.println(list.contains(str));
        System.out.println(list.get(1) == str);
        System.out.println(list.get(1).equals(str));
        System.out.println(list.get(1).compareTo(str));
        System.out.println("-----------------------");

        User user1 = new User(12);
        User user2 = new User(22);
        User user3 = new User(22);

        List<User> listUser = new ArrayList<>();
        listUser.add(new User(12));
        listUser.add(user1);
        listUser.add(user2);

        System.out.println("-----------------------");
        System.out.println();

        System.out.println(listUser.contains(user3));
        System.out.println(listUser.get(2).equals(user3));
        System.out.println(listUser.get(1).equals(listUser.get(0)));
        System.out.println(listUser.get(1).compareTo(listUser.get(2)));


    }
}

class User implements Comparable<User> {

    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(User o) {

//        if (this.age > o.age) {
//            return 1;
//        }
//        if(this.age < o.age){
//            return -1;
//        } else {
//            return 0;
//        }
        return this.age - o.age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return age == user.age;

    }


}
