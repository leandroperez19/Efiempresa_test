import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class UseCase {
    String text1;
    String text2;
    boolean expected;

    UseCase(String text1, String text2, boolean expected) {
        this.text1 = text1;
        this.text2 = text2;
        this.expected = expected;
    }
}


public class Challenge1Test {
    UseCase useCase1;
    UseCase useCase2;
    UseCase useCase3;
    UseCase useCase4;

    @Before
    public void setUp() {
        useCase1 = new UseCase("esta es una nota", "esta es una revista que tiene una nota", true);
        useCase2 = new UseCase("esta es una nota importante", "esta es una revista que tiene una nota", false);
        useCase3 = new UseCase("hello world world", "hello from the other side of the world", false);
        useCase4 = new UseCase("return true", "Este es un test hecho para que el return sea igual a true", true);
    }

    @Test
    public void test1() {
        boolean res = Challenge1.canWriteNote(useCase1.text1, useCase1.text2);
        assertEquals(useCase1.expected, res);
    }
    @Test
    public void test2() {
        boolean res = Challenge1.canWriteNote(useCase2.text1, useCase2.text2);
        assertEquals(useCase2.expected, res);
    }
    @Test
    public void test3() {
        boolean res = Challenge1.canWriteNote(useCase3.text1, useCase3.text2);
        assertEquals(useCase3.expected, res);
    }
    @Test
    public void test4() {
        boolean res = Challenge1.canWriteNote(useCase4.text1, useCase4.text2);
        assertEquals(useCase4.expected, res);
    }
}