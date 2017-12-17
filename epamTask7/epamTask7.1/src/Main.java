import java.util.List;
import java.util.Set;

/**
 * Created by Orest
 * 10.12.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list= Generator.generateList(10,0,50);
        System.out.println(list);

        Set<Integer> set = Generator.generateSet(15,5,30);
        System.out.println(set);
    }
}
