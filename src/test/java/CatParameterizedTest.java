

import com.example.Cat;
import com.example.Predator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CatParameterizedTest {

    @Mock
    Predator predator;

    @ParameterizedTest
    @MethodSource("foodProvider")
    void testGetFoodParameterized(List<String> expectedFood) throws Exception {
        when(predator.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(predator);

        assertEquals(expectedFood, cat.getFood());
    }

    static Stream<List<String>> foodProvider() {
        return Stream.of(
                List.of("Птицы"),
                List.of("Рыба"),
                List.of("Мыши"),
                List.of("Птицы", "Рыба"),
                List.of()
        );
    }
}
