package colllectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayList {
    public static void main(String[] args) {
//        LinkedList<Integer> id=new LinkedList<>();
//        id.add(6);
//        id.add(8);
//        id.add(16);
//        id.add(15);
//        System.out.println(id);
//        System.out.println(id.get(3));
//        System.out.println(id.remove(1));
//        System.out.println(id);
//        System.out.println("number of elememts in array : " +id.size());
//        System.out.println(id.contains(18));
//        System.out.println(id.contains(15));
//        id.add(143);
//        System.out.println(id);
//        id.addFirst(268);
//        System.out.println(id);
//        id.addLast(268);
//        System.out.println(id);
//        System.out.println(id.removeLast());
//        System.out.println(id.removeFirst());
//        System.out.println(id);
        ArrayList<String> name=new ArrayList<>();
        name.add("anu");
        name.add("arun");
        name.add("vennela");
        name.add("deepu");
        name.add("hamsa");
        System.out.println(name);
        System.out.println(name.get(4));
        System.out.println(name.contains("fty"));
        System.out.println(name.remove("vennela"));
        System.out.println(name);

    }
}
