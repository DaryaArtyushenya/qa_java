

import com.example.Cat;
import com.example.Predator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Mock
    Predator predator;

    @Test
    void testGetSound() {
        Cat cat = new Cat(predator);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void testGetFoodUsesPredator() throws Exception {
        //тут
        when(predator.eatMeat()).thenReturn(List.of("Птицы"));

        Cat cat = new Cat(predator);

        assertEquals(List.of("Птицы"), cat.getFood());
    }
}
