package JavaWeek6.Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validation {
    private long creditCardNumber;

    public Validation(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    public Boolean isValid() {
        Integer totalSumNumber = getFinalSumNumber(creditCardNumber);


        return totalSumNumber % 10 == 0;
    }

    private Integer getFinalSumNumber(long creditCardNumber) {
        List<String> creditCardNumbers = Arrays.asList(Long.toString(creditCardNumber).split(""));
        Integer numberOfDigitNumbers = creditCardNumbers.size() / 2;
        Integer position = 1;
        Integer sumDigitNumbers = 0;

        for (int i = 0; i < numberOfDigitNumbers; i++) {
            String digitString = creditCardNumbers.get(position);
            Integer digitNumber = Integer.valueOf(digitString);
            Integer doubleDigitNumber = digitNumber * 2;
            if (digitNumber >= 5) {
                doubleDigitNumber -= 9;
            }
            sumDigitNumbers += doubleDigitNumber;
            position += 2;
        }
        Integer numberOfOtherNumbers = (creditCardNumbers.size() + 1) / 2;
        Integer position1 = 0;
        Integer sumOtherNumbers = 0;
        for (int i = 0; i < numberOfOtherNumbers; i++) {
            String otherString = creditCardNumbers.get(position1);
            Integer digitNumber = Integer.valueOf(otherString);
            sumOtherNumbers += digitNumber;
            position1 += 2;
        }
        Integer finalSumNumber = sumDigitNumbers + sumOtherNumbers;


        return finalSumNumber;
    }
}