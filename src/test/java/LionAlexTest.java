
import com.example.FelineInterface;
import com.example.LionAlex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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

    @Test
    void testAlexFriendsList() throws Exception {
        LionAlex alex = new LionAlex(feline);

        assertEquals(3, alex.getFriends().size());
        assertEquals("Марти", alex.getFriends().get(0));
        assertEquals("Глория", alex.getFriends().get(1));
        assertEquals("Мелман", alex.getFriends().get(2));
    }

    @Test
    void testAlexPlaceOfLiving() throws Exception {
        LionAlex alex = new LionAlex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}
