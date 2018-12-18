package ReflectionWeek5;

public  abstract class Car {
//    @Override
//    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                '}';
//    }

    private String brand;

    public String getBrand() {
        return brand;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String drive(){

         return getBrand();


    }

}
