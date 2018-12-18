package JavaWeek7.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NickNameGeneratorTest {
    NickNameGenerator nickNameGenerator = new NickNameGenerator();
    @Test
    void testNoLetters(){
        Assertions.assertEquals(Optional.empty(),nickNameGenerator.cutWords(""));


    }
    @Test
    void testOneLetter(){
        String name = "m";
        Assertions.assertEquals("m",nickNameGenerator.cutWords(name).get());
    }
    @Test
    void testMoreThanOneLetter(){
        String name = "mohamed";
        Assertions.assertEquals("moh",nickNameGenerator.cutWords(name).get());
    }

}