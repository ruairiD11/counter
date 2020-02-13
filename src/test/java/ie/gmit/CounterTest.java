package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterTest {

    Counter myCounter;

    @Test
    void testConstructor()
    {
        myCounter = new Counter();
        assertEquals(0, myCounter.getCount());
    }

    @Test
    void testIncrement()
    {
        myCounter = new Counter();
        assertEquals(1, myCounter.increment());
    }
}
