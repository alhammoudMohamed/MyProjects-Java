package JavaWeek6.Exercise5;

import java.util.Arrays;
import java.util.List;

public class Credit {


        List<CreditCard> creditCards = Arrays.asList(new AmericanExpress(), new MasterCard(), new Visa());


        public String getCreditCardName(long creditCardNumber) {
            ListOfValidators listOfValidators = new ListOfValidators();
            Validation validation = new Validation(creditCardNumber);

            if (!validation.isValid()) {
                return "INVALID";
            }
            for (CreditCard creditCard : creditCards) {
                if (creditCard.checkWhichCreditCard(listOfValidators.getLengthNumber(creditCardNumber), listOfValidators.getStartNumber(creditCardNumber))) {
                    return creditCard.getNameOfCreditCard();

                }


            }
            return "INVALID";

        }

        @Override
        public String toString() {
            return
                    "creditCards=" + creditCards
                    ;
        }
    }
