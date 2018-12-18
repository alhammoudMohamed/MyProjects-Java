package JavaWeek6.Exercise5;

import java.util.Arrays;

public class MasterCard extends CreditCard {


        public MasterCard() {
            super(Arrays.asList(16), Arrays.asList(51, 52, 53, 54, 55));
        }

        @Override
        public String getNameOfCreditCard() {
            return "Master Card";
        }
    }