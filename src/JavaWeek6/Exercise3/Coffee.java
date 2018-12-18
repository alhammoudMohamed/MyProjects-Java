package JavaWeek6.Exercise3;

public class Coffee {
    public String getMadeBy() {
        return madeBy;
    }

    public Integer getBrewedTime() {
        return brewedTime;
    }

    public Coffee(String madeBy, Integer brewedTime) {
        this.madeBy = madeBy;
        this.brewedTime = brewedTime;
    }

    private String madeBy;
    private Integer brewedTime;


}
