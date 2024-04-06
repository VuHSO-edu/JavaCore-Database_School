import java.util.*;

public class Sets {


    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (Integer value : first) {
            if (second.contains(value)) {
                intersection.add(value);
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
       Set<Integer> union = new HashSet<>(first);
        for (Integer value : first) {
            if(!second.contains(value)) {
                union.add(value);
            }
        }
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new LinkedList<>();
        list.addAll(source);
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>(source);
        List<Integer> list = new LinkedList<>(set);
        return list;
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        Set<Integer> set = new HashSet<>();
        for (Integer value : source) {
            set.add(value);
        }
        List<Integer> list = new LinkedList<>(set);
        return list;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return String.valueOf(c);
            }
            set.add(c);
        }
        return null;
    }

    public static Set<Character> allRecurringCharacters(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> recurring = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                recurring.add(c);
            }
            set.add(c);
        }
        return recurring;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        source.toArray(array);
        return array;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        Integer greater = source.higher(value);
        return greater != null ? greater : -1;
    }

}
