package JavaWeek8.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class NamesList {
    public static void main(String[] args) {
    List<String>names =new ArrayList<>( Arrays.asList("somewhere","scenario","table","cable","glass","backpack","mouse"));
    System.out.println(names);
    names.removeIf(e->e.endsWith("e"));
    names.replaceAll(e->e.toUpperCase());
    names.removeIf(e->e.length()<6);
    names.forEach(name-> System.out.println(name));
}
    }
