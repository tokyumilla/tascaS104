package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculoDNI {
    private int number;
    private char character;

    public CalculoDNI(int number) {
        if (((int) (Math.log10(number) +1)) == 8) {
            this.number = number;
            int module = number% 23;
            List<Character> characterList = new ArrayList<>(Arrays.asList('T', 'R',
                    'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                    'C', 'K', 'E'));
            this.character = characterList.get(module);
        }
        else {
            System.out.println("Número incorrecto, introduzca un número de 8 cifras");
        }

    }

    public int getNumber() {
        return number;
    }

    public char getCharacter() {
        return character;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
