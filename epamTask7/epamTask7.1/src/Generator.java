import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Orest
 * 10.12.2017
 * Java Version 1.8.
 */
public class Generator {

    public static List<Integer> generateList(int count, int min , int max){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add((int)(Math.random()*(max-min)));
        }
        return list;
    }

    public static Set<Integer> generateSet(int count, int min , int max){
        if (max - min < count) throw new IllegalArgumentException();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add((int)(Math.random()*(max-min)));
        }
        return set;
    }
}
