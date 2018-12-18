package JavaWeek6.Exercise2;

public abstract class IceCream {
    private String flavor;
    private String topping;

    public IceCream(String flavor, String topping) {
        this.flavor = flavor;
        this.topping = topping;
    }
    public abstract String eat();


    protected String getFlavor() {
        return flavor;
    }

    protected String getTopping() {
        return topping;
    }
}

