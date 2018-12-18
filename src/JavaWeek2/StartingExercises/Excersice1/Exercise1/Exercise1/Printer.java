package JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise1;


import JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise5.Magazine;

import java.util.List;

public class Printer {
    public void print(Article article) {

        System.out.println("Printing " + article.getTitle());

        System.out.println(" Printing " + article.getText());
    }
    public void printMagazine(Magazine magazine){

        System.out.println(magazine.getTitle());

        List<Article> current = magazine.getArticles();
        for (Article article : current) {
            System.out.print(article.getTitle() + ": ");
            System.out.println(article.getText());
        }

    }


}

/*Reuse the Printer from exercise 1
(don’t copy it, reuse the existing one from the package where it already is).
 Add the new method printMagazine to the Printer that receives a Magazine and displays its title and then all the articles.
 */