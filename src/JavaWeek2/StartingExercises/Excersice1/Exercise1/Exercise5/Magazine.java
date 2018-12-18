package JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise5;

import JavaWeek2.StartingExercises.Excersice1.Exercise1.Exercise1.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private String title;
    List<Article> articles = new ArrayList<Article>();


    public String getTitle() {
        return title;
    }

    public Magazine(String title) {
        this.title = title;
    }

    public void add(Article article) {
        articles.add(article);
    }

    public List<Article> getArticles() {
        return articles;
    }
}

    /*A Magazine has a title and a list of Article. Its constructor only asks for the title.
    Make sure its articles are initialized with an empty collection.
     It also has the method add to add an Article to its list and the method getArticles that returns the list.*/
