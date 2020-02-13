package ie.gmit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CounterTest {

    Counter myCounter;

    @BeforeAll
    static void startingTests()
    {
        System.out.println("Starting Tests");
    }

    @BeforeEach
    void createInstance(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry(testInfo.getDisplayName());
        myCounter = new Counter();
    }

    @AfterAll
    static void testingComplete()
    {
        System.out.println("Testing Complete");
    }

    @DisplayName("Checking Constructor is initialised")
    @Test
    void testConstructor()
    {
        assertEquals(0, myCounter.getCount());
    }

    @DisplayName("Testing increment method")
    @Test
    void testIncrement()
    {
        assertEquals(1, myCounter.increment());
    }

    @DisplayName("Testing decrement method")
    @Test
    void testDecrement()
    {
        assertEquals(-1, myCounter.decrement());
    }

    @DisplayName("Testing constructor with value(success)")
    @Test
    void testConstructorWithValueSuccess()
    {
        myCounter = new Counter(1);
        assertEquals(1, myCounter.getCount());
    }

    @DisplayName("Testing constructor with value(failure)")
    @Test
    void testConstructorWithValueFailure()
    {
        assertThrows(IllegalArgumentException.class, ()-> {new Counter(-1);});
    }
}
