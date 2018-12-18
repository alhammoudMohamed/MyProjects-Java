//package Reflection3Solution;
//
//import java.util.*;
//
//public class NumberMirror {
//    public Integer mirror(Integer number) {
//        List<String> numbers = separate(number);
//        Collections.reverse(numbers);
//        String reversed = String.join("", numbers);
//        return Integer.valueOf(reversed);//it changes it from string to integer//
//    }
//
//    private List<String> separate(Integer number) {
//        String string = number.toString();// to change the number to a string//
//        final String[] split = string.split("");
//        List<String> immmutableNumbers = Arrays.asList(split);
//        List<String> mutableNumbers = new ArrayList<>(immmutableNumbers);
//        return mutableNumbers;
//
//
//    }
//
//
//}
//
//
//
//
//
//
//// we had to change the integer to a string so that we can split it //
//// and the result is a collection
////
////we cannot make changes the array
////that is why we need to change it to a list (new array list//
//// the separate we take an integer and change it into a list of strings//
