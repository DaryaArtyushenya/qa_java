

import com.example.FelineInterface;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    FelineInterface feline;

    @Test
    void testLionHasManeIfMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    void testLionHasNoManeIfFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    void testLionThrowsExceptionOnWrongSex() {
        assertThrows(Exception.class, () -> new Lion("Боевой вертолёт", feline));
    }

    @Test
    void testGetKittensUsesFeline() throws Exception {
        when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline);

        assertEquals(3, lion.getKittens());
    }

    @Test
    void testGetFoodUsesFeline() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));

        Lion lion = new Lion("Самка", feline);

        assertEquals(List.of("Мясо"), lion.getFood());
    }
}
