package JavaWeek4.Exercise7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println(index);
        Integer page1 = 1;
        Integer page2 = 2;
        Topic Science = new Topic("Science");
        Topic Math = new Topic("Math");
        Topic Sport = new Topic("Sport");
        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();
        topics1.add(Science);
        topics2.add(Math);
        topics2.add(Sport);
        index.put(page1, topics1);
        index.put(page2,topics2);
        index.put(page2,topics2);
        System.out.println("the map keys : " + index.keySet());
        System.out.println("the map values: " + index.values());
        boolean containspage1 = index.containsKey(page1);
        System.out.println(" The index contains : " + containspage1);
        Integer indexSize = index.size();
        System.out.println("The index size is " + indexSize);




    }

}
