package JavaWeek6.Exercise5;

import java.util.List;

public abstract class CreditCard {


        List<Integer> length;
        List<Integer> startNumber;

        public List<Integer> getLength() {
            return length;
        }

        public List<Integer> getStartNumber() {
            return startNumber;
        }

        public CreditCard(List<Integer> length, List<Integer> startNumber) {
            this.length = length;
            this.startNumber = startNumber;
        }

        public abstract String getNameOfCreditCard();

        public Boolean checkWhichCreditCard(Integer length, Integer startNumber) {


            return getLength().contains(length) && getStartNumber().contains(startNumber);


        }

    }