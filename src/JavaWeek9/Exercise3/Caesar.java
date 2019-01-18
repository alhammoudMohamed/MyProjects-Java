package JavaWeek9.Exercise3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {
    private List<String> alphabetLetters = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

    public String cihper(String text, Integer key) {
        return Stream.of(text.split(""))
                .map(e -> getEncryptedLetter(e, key))
                .collect(Collectors.joining());

    }

    private String getEncryptedLetter(String letter, Integer key) {
        char charachter = letter.charAt(0);
        if(!Character.isAlphabetic(charachter))
            return letter;
        if (Character.isLowerCase(charachter)) {
            return transformLetter(letter, key);
        }


        String transformedLetterInLowerCase = transformLetter(letter.toLowerCase(), key);
        return transformedLetterInLowerCase.toUpperCase();

    }
    private String transformLetter(String letter,Integer key){
        int position = alphabetLetters.indexOf(letter);
        int newPosition = (position+key)%alphabetLetters.size();
        return alphabetLetters.get(newPosition);
    }


}