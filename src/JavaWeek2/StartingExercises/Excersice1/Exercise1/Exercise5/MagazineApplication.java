package JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise5;

import JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise1.Printer;


public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine currentDraft = editor.writeMagazine();
        Printer printer = new Printer();
        printer.printMagazine(currentDraft);
    }
}
