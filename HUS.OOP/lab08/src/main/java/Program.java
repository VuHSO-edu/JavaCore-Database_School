import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();

        list.add(12);
        list.add(10);
        list.add(11);
        list.add(15);
        list.add(4);
        list.add(6);
        list.add(6);
        list.add(6);

        System.out.println(Sets.toList(list));
    }
}
