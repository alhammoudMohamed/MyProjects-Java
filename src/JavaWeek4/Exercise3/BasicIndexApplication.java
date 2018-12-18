package JavaWeek4.Exercise3;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {
    public static void main(String[] args) {

        Map<String,Integer > book = new HashMap<>();
        System.out.println(book);
        Integer page1 = 1;
        Integer page2 =2;
        Integer page3 = 3;
        String firstTopic = "Java";
        String secondTopic = "Swimming";
        String thirdTopic = "Flying";
        book.put(firstTopic,page3);
        book.put(secondTopic,page2);
        book.put(thirdTopic,page1);
        System.out.println(book);
        System.out.println("Book Keys" + book.keySet());
        System.out.println("Book value" + book.values());

        String fourthTopic = "Sleeping";
        book.put(fourthTopic, page1);
        boolean containsJava = book.containsKey(firstTopic);
        System.out.println("Does the book contain? " + containsJava);

        book.get(secondTopic);
        System.out.println(secondTopic);
        Integer BookSize = book.size();
        System.out.println(BookSize);







    }
}
