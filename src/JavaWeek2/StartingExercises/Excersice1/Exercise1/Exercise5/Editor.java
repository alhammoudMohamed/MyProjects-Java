package JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise5;

import JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise1.Article;

/*n Editor has no attributes. It has the writeMagazine method that returns a Magazine.
In order to create a Magazine it creates first three Articles, it adds them to the Magazine and then it returns it.

 */
public class Editor {
    public Magazine writeMagazine() {
        Magazine magazine = new Magazine("Magazine");
        Article article1 = new Article("Math", "something");
        Article article2 = new Article("Java", "impossible");
        Article article3 = new Article("english", "nothing");
        magazine.add(article1);
        magazine.add(article2);
        magazine.add(article3);

        return magazine;

    }

}
