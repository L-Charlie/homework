package homework45;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList<T> {
    public static void main(java.lang.String[] args) {
        ArrayList<String> MyList = new ArrayList<>();
        MyList.add("邓紫棋");
        MyList.add("Taylor");
        MyList.add("Hebe");
        for (String idor : MyList) {
            System.out.println(idor);
        }
        System.out.println();
        Iterator<String> Itr = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
        Itr.next();
        while (Itr.hasNext())
            System.out.println(Itr.hasNext() + " ");

    }
}
