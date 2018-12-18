package JavaWeek7.Exercise6;

import java.util.Arrays;
import java.util.List;

public class HandShakes {
    private static List<HandShake> moves = Arrays.asList(new ThumbTouchesBack(new String()),new TicklesOverPalm(new String())
            ,new BroKnock(new String()),new ThousandKnuckles(new String()));
    public static List<HandShake>getHandShakes() {
        return moves;
    }

}
