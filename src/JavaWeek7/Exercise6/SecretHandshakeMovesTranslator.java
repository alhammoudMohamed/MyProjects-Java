package JavaWeek7.Exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretHandshakeMovesTranslator {
    public List<String> secretHandShakeMoves(Integer number){
        List<String>digits = new ArrayList<>();
         String digit = number.toString();
         String[] split = digit.split("");
         List<String> strings = Arrays.asList(split);
        for (String string : strings) {
            String move = getMove(string);
           if(move.contains(" ")){
               digits.add(move);
           }

        }
        return digits;
    }

    private String getMove(String number) {
        String move= "";
        List<HandShake> handShakes = HandShakes.getHandShakes();
        for (HandShake handShake : handShakes) {
            if(handShake.isThere(number)){
                move=handShake.getName();
                return move;
            }
        }
        return move;
    }


}
