package JavaWeek6.Exercise2;

public class CupIceCream extends IceCream {
    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The " + getFlavor()+" Ice-cream " + getTopping() + " is eaten with a spoon ";
    }
}
