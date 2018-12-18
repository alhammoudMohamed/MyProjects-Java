package JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise1;

public class PrintApplication {
    public static void main(String[] args) {
        Article article = new Article("title", "text");
        Printer printer = new Printer();
        printer.print(article);



    }

}
