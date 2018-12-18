package JavaWeek6.Exercise2;

public class IceCreamApplication {
    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Vanilla","Oreo");
        System.out.println(cone.eat());
        IceCream cone2= new CupIceCream("Chocolate", "banana");
        System.out.println(cone2.eat());
    }
}
