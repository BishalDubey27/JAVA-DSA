package ArrayList;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> age = new ArrayList<>();

        // add elements

        age.add(22);
        age.add(45);
        age.add(55);
        age.add(47);
        age.add(46);

        System.out.println(age);
        System.out.println(age.get(0));

        age.set(1, 10);
        System.out.println(age);

        System.out.println(age.get(1));


        age.remove(1);
        System.out.println(age);

        for (int ages : age) {
            System.out.print(ages + " ");
        }

    }
    
}
