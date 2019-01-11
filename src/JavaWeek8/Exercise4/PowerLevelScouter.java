package JavaWeek8.Exercise4;
import java.util.function.Function;
import java.util.function.Predicate;

public class PowerLevelScouter {

    public Integer getAscii(String name, Function<String, Integer> condition) {
        Integer result = 0;
        String[] splitted = name.split("");
        for (String letter : splitted) {
            result += condition.apply(letter);
        }
        return result;
    }
    public Integer scout(String name) {
        return getAscii(name, n -> (int) n.charAt(0));
    }
    public Integer scoutEnhanced(String name){
        return getAscii(name.toLowerCase(),n->(int)n.charAt(0));
    }
}
