package lv.ctco.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        set();
        maps();
	// write your code here
    }

    private static void maps() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("one", "eins");
        map.put("two", "zwei");
        map.put("three", "drei");
        map.put("four", "vier");

        System.out.println(map.getOrDefault("four", "unknown"));
        System.out.println(map.getOrDefault("five", "unknown"));

        System.out.println(map);

        String n = map.computeIfAbsent("one", k -> k + "0000");
        String m = map.computeIfAbsent("five", k -> k + "0000");
        System.out.println(n);
        System.out.println(m);
        System.out.println(map);

        for (String k : map.keySet()){
            System.out.println(k);
        }
        del();
        for (String k : map.values()){
            System.out.println(k);
        }
    }

    private static void set() {
        Set<String> s1 = new TreeSet<>(Comparator.reverseOrder());
        s1.add("Berlin");
        s1.add("Neustift");
        s1.add("Trebinje");
        s1.add("Kotor");
        s1.add("Spoleto");
        s1.add("Berlin");
        s1.add("Altdorf");
        s1.add("Villalpando");
        s1.addAll(Arrays.asList("Rothenburg", "Innsbruck", "Berlin"));
        s1.remove("Berlin");
        System.out.println(s1);
        Set<String> s2 = new HashSet<>();
        s2.add("Neustift");
        s2.add("Trebinje");
        s2.add("Kotor");
        s2.add("Krakow");
        s2.add("Bratislava");

//        s1.removeAll(s2);
//        s1.retainAll(s2);
        s1.addAll(s2);
        System.out.println(s1);

    }

//    static void arrayList() {
//        ArrayList<String> list = new ArrayList<String>(100);
//        list.add("Abc");
//        list.add("zyx");
//        list.add("jokalemene");
//        System.out.println(list);
//        list.ensureCapacity(100);
//        list.trimToSize();
//        list.add(2, "tttt");
//        System.out.println(list);
//        String s = list.get(1);
//        System.out.println(s);
//        Collections.shuffle(list);
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//    }

    private static void del() {
        System.out.println("---------------------------------------------");
    }
}
