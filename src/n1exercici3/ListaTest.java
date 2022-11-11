package n1exercici3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListaTest {
    private Lista lista = new Lista();

    @Test
    void exceptionTest (){

        assertThrows(IndexOutOfBoundsException.class,
                () -> {lista.exceptionthrowing();});

    }


}