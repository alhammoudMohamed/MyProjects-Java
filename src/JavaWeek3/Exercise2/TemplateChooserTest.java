package JavaWeek3.Exercise2;

import JavaWeek3.Excercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemplateChooserTest {

    TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void testMenTemplate() {
        Customer customer = new Customer("Mr.bla", "5");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("Man", template);

    }

    @Test
    void testWomanTemplate() {
        Customer customer = new Customer("Mrs.", "5");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("women", template);


    }

    @Test
    void testDefaultTemplate() {
        Customer customer = new Customer("idiot", "5");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("default", template);
    }
}
