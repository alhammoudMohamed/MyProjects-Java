package JavaWeek6.Exercise2;

public class ConeIceCream extends IceCream {
    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The " + getFlavor() + " ice-Cream " + getTopping() + " is licked";


    }
}
