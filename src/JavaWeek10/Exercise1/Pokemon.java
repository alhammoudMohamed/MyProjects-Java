package JavaWeek10.Exercise1;

public class Pokemon {
    private String name;
    private String type;
    private Integer HP;
    private Integer speed;
    private Integer generation;
    private String legendary;

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", generation='" + generation + '\'' +
                ", legendary='" + legendary + '\'' +
                '}';
    }

    public Pokemon(String name, String type, Integer HP, Integer speed, Integer generation, String legendary) {
        this.name = name;
        this.type = type;
        this.HP = HP;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }


    public String getLegendary() {
        return legendary;
    }
}

