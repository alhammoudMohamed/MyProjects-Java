package JavaWeek9.Exercise5;

public class Film {
    private String title;
    private Double scour;
    private Integer voteCount;
    private Integer runTime;
    private Long budget;
    private Long revenue;


    public Film(String title, Double scour, Integer voteCount, Integer runTime, Long budget, Long revenue) {
        this.title = title;
        this.scour = scour;
        this.voteCount = voteCount;
        this.runTime = runTime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScour() {
        return scour;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return title;
    }
}