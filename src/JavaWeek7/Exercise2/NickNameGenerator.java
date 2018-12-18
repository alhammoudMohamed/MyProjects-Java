package JavaWeek7.Exercise2;

import java.util.Optional;

public class NickNameGenerator {
    public Optional<String> cutWords(String name) {
        if (name.length() == 0) {
            return Optional.empty();
        }
        if (name.length() == 1) {
            return Optional.of(name);
        }
        Integer nicknameLenght = name.length() / 2;
        String nickname = name.substring(0, nicknameLenght);
        return Optional.of(nickname);
    }
}
