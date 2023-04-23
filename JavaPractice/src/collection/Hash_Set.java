package collection;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("치킨");
        set.add("초밥");
        set.add("치킨");
        set.add("삼겹살");
        set.add("초밥");
        set.add("치킨");

        for (String s : set){
            System.out.println(s);
        }
        System.out.println("=========================");
        if (set.contains("초밥")){
            set.remove("초밥");
        }

        for (String s : set){
            System.out.println(s);
        }

        set.clear();

        System.out.println("=========================");

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(15);
        intSet.add(13);
        intSet.add(7);

        for (int i : intSet){
            System.out.println(i);
        }

        //순서 보장하고 싶으면 LinkedHastSet 이어야 함
    }
}
