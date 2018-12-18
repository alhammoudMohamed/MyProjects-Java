package JavaWeek6.Exercise5;

import java.util.Arrays;
import java.util.List;

public class ListOfValidators {

        public Integer getLengthNumber(long number) {
            List<String> stringNumbers = Arrays.asList(Long.toString(number).split(""));

            Integer length = stringNumbers.size();
            return length;
        }

        public Integer getStartNumber(long number) {
            List<String> stringNumbers = Arrays.asList(Long.toString(number).split(""));
            String firstNumber = stringNumbers.get(0);
            String secondNumber = stringNumbers.get(1);
            String startWith = firstNumber + secondNumber;
            Integer startWithNumber = Integer.valueOf(startWith);


            return startWithNumber;
        }
    }

