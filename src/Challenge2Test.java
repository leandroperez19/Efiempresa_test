import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Challenge2Test {
    @Test
    public void test1() {
        List<Student> MathStudents = Arrays.asList(
                new Student("Sandra Barahona", "Malaga"),
                new Student("Angela Suarez", "Malaga"),
                new Student("Luisa Andrade", "Malaga")
        );
        List<Student> FrenchStudents = Arrays.asList(
                new Student("Viviana Mena", "Madrid"),
                new Student("Luisa Andrade", "Madrid")
        );
        List<Student> MathFrenchStudents = Arrays.asList(
                new Student("Yoander Mena", "Barcelona"),
                new Student("Jesus Rosales", "Malaga"),
                new Student("Luisa Andrade", "Barcelona")
        );
        String res = Challenge2.notifyStudents(MathStudents, FrenchStudents, MathFrenchStudents);
        String expected =
                "Email enviado a: Sandra Barahona, Angela Suarez, Luisa Andrade, Jesus Rosales";
        assertEquals(expected, res);
    }

    @Test
    public void test2() {
        List<Student> MathStudents = Arrays.asList(
                new Student("Carlos Perez", "Valencia"),
                new Student("Maria Gomez", "Malaga"),
                new Student("Juan Martinez", "Granada")
        );

        List<Student> FrenchStudents = Arrays.asList(
                new Student("Elena Fernandez", "Bilbao"),
                new Student("Miguel Rodriguez", "Malaga"),
                new Student("Ana Lopez", "Valencia"),
                new Student("Maria Gomez", "Malaga")
                );

        List<Student> MathFrenchStudents = Arrays.asList(
                new Student("Pablo Diaz", "Zaragoza"),
                new Student("Lucia Torres", "Valladolid"),
                new Student("Sofia Alvarez", "Alicante"),
                new Student("Miguel Rodriguez", "Malaga")
        );
        String res = Challenge2.notifyStudents(MathStudents, FrenchStudents, MathFrenchStudents);
        String expected =
                "Email enviado a: Maria Gomez, Miguel Rodriguez";
        assertEquals(expected, res);
    }
}
