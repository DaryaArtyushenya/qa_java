

import com.example.Feline;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FelineTest {

    @Test
    void testEatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    void testGetFamilyReturnsCorrectValue() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void testGetKittensDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void testGetKittensWithArgument() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}

