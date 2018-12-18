package JavaWeek7.Exercise3;

import java.util.*;

public class NumberJudge {
    public Optional<Integer> getBiggest(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return Optional.empty();
        }
        Collections.sort(numbers);
        Integer biggest = numbers.get(0);
        return Optional.of(biggest);
    }

    public Optional<Integer> getSmallest(List<Integer> numbers) {
        if (numbers.isEmpty()){
            return Optional.empty();

        }
        Collections.sort(numbers);
        int size = numbers.size();
        Integer smallest = numbers.get(size - 1);
        return Optional.of(smallest);
    }



    public List<Integer> split(Integer number) {
        String numberAsString = number.toString();
        List<String>numbersListAsString = Arrays.asList(numberAsString.split(""));
       List<Integer> numbers = new ArrayList<>();
        for (String string : numbersListAsString) {
            Integer partOfNumber = Integer.valueOf(string);
            numbers.add(partOfNumber);

        }
       return numbers;
    }
}