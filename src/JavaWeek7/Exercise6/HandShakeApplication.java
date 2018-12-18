package JavaWeek7.Exercise6;

import java.util.List;

public class HandShakeApplication {
    public static void main(String[] args) {
        SecretHandshakeMovesTranslator secretHandshakeMovesTranslator = new SecretHandshakeMovesTranslator();
        List<String >names = secretHandshakeMovesTranslator.secretHandShakeMoves(22336);
        System.out.println(names);
    }
}
