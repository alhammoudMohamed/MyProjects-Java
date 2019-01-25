package JavaWeek10.Exercise4;

public class Main {
    public static void main(String[] args) {

        CharachterComparator comparator = new CharachterComparator();




        System.out.println("Number Of Charachters Appeared in The Book in Total: " +comparator.getNumberOfCharachter());

        System.out.println("Number of Deaths: "  + comparator.getNumberOfDeath());
        comparator.getBiggestDeathCountBook();


    }
}
