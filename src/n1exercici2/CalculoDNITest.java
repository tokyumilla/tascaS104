package n1exercici2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDNITest {
    private CalculoDNI nuevoDNI;


    @ParameterizedTest
    @CsvSource({
            "14311824, M",
            "14311825, Y",
            "14311826, F",
            "14311827, P",
            "14311828, D",
            "14311829, X",
            "14311830, B",
            "14311831, N",
            "14311832, J",
            "14311833, Z"
    })
    void testCharacters (int number, char character) {
        nuevoDNI = new CalculoDNI(number);
        assertEquals(character, nuevoDNI.getCharacter());
    }



}