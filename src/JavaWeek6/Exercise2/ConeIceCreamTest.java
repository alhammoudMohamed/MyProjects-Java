package JavaWeek6.Exercise2;
import JavaWeek6.Exercise2.ConeIceCream;
import JavaWeek6.Exercise2.CupIceCream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConeIceCreamTest {
   @Test
   void testConeIceCream(){
       String expected = "The chocolate ice-Cream oreo is licked";
       ConeIceCream coneIceCream = new ConeIceCream("chocolate","oreo");
       String result=coneIceCream.eat();
       Assertions.assertEquals(expected,result);
   }
   @Test
   void testCupIceCream() {
       String expected = "The vanilla ice-cream with cookies is eaten with a spoon.";
       CupIceCream cupIceCream = new CupIceCream("vanilla", "cookies");
       String result = cupIceCream.eat();
       Assertions.assertEquals(expected,result);
   }

}