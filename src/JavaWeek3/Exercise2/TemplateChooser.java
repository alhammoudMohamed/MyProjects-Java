package JavaWeek3.Exercise2;

import JavaWeek3.Excercise1.Customer;

public class TemplateChooser {
    public String chooseTemplate(Customer customer) {
        customer.getName().trim();
        if (customer.getName().contains("Hokopoko")) {
            return ("privileged");

        }

        if (customer.getName().startsWith("Mrs.")) {
            return ("women");
        }
        if (customer.getName().startsWith("Mr.")) {
            return ("Man");

        }
        if (customer.getName().startsWith("Ms.")) {
            return ("Women");
        } else {
            return ("default");

        }

    }
}
