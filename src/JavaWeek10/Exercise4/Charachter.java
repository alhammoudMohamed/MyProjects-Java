package JavaWeek10.Exercise4;

public class Charachter {
    private String name;
    private String allegiances;
    private String deathYear;
    private String bookOfDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private Integer gender;
    private Integer nobility;

    public Charachter(String name, String allegiances, String deathYear, String bookOfDeath, String deathChapter, String bookIntroChapter, Integer gender, Integer nobility) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathYear = deathYear;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public Integer getGender() {
        return gender;
    }

    public Integer getNobility() {
        return nobility;
    }
}
