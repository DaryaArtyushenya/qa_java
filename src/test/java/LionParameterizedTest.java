
import com.example.FelineInterface;
import com.example.Lion;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LionParameterizedTest {

    @Mock
    FelineInterface feline;

    @ParameterizedTest
    @MethodSource("validSexProvider")
    void testLionManeParameterized(String sex, boolean expectedHasMane) throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    static Stream<Object[]> validSexProvider() {
        return Stream.of(
                new Object[]{"Самец", true},
                new Object[]{"Самка", false}
        );
    }

    @ParameterizedTest
    @MethodSource("invalidSexProvider")
    void testLionInvalidSex(String invalidSex) {
        assertThrows(Exception.class, () -> new Lion(invalidSex, feline));
    }

    static Stream<String> invalidSexProvider() {
        return Stream.of(
                "", " ", "тигр", "123", "самец", "SAMKA"
        );
    }


}
