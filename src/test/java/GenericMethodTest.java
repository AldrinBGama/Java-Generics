import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GenericMethodTest {
    int [] integers = {12, 324, 6, 7900};
    String[] strings = {"Dog", "Cat", "Lion", "Rat", "Elephant"};

    @Test
    void printArrayContent(int[] integers) {
        assertEquals(new int[] {12, 324, 6, 7900}, integers, "Array Equal Test");
    }

    @Test
    void printArrayContent(String[] strings) {
        assertEquals(new String[] {"Dog", "Cat", "Lion", "Rat", "Elephant"}, strings, "Array Equal Test");
    }
}