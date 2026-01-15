
import com.example.FelineInterface;
import com.example.LionAlex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class LionAlexTest {

    @Mock
    FelineInterface feline;

    @Test
    void testAlexIsMale() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertTrue(alex.doesHaveMane());
    }

    @Test
    void testAlexHasZeroKittens() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test void testAlexFriendsList() throws Exception {
        LionAlex alex = new LionAlex(feline);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends()); }

    @Test
    void testAlexPlaceOfLiving() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}
