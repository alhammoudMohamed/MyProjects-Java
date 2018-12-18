package JavaWeek3.Exercise2;

import JavaWeek3.Excercise1.Customer;

class InsuranceApplication {

    public static void main(String[] args) {


        Customer customer1 = new Customer("Mr.bla", "5");
        Customer customer2 = new Customer("Ms.bla", "5");
        Customer customer3 = new Customer("Mrs.bla", "5");
        Customer customer4 = new Customer("Mr.Hokopoko", "5");
        Customer customer5 = new Customer("haha", "5");
        TemplateChooser templateChooser = new TemplateChooser();
        templateChooser.chooseTemplate(customer1);
        System.out.println(templateChooser.chooseTemplate(customer1));
        System.out.println(templateChooser.chooseTemplate(customer2));
        System.out.println(templateChooser.chooseTemplate(customer3));
        System.out.println(templateChooser.chooseTemplate(customer4));
        System.out.println(templateChooser.chooseTemplate(customer5));



    }
}