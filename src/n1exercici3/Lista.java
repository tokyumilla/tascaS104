package n1exercici3;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();


    public Lista() {
        this.numbers.add(1);
        this.numbers.add(2);
        this.numbers.add(3);
    }

    public void exceptionthrowing () {
        numbers.get(numbers.size());
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
}
