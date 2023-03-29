package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @DisplayName("Test O/I - Hello World")
    @Test
    public void testMain() {
        App.main(null);
        Assertions.assertEquals("Hello, World." + System.lineSeparator() + "Hello, Java.", outputStreamCaptor.toString()
                .trim());
    }
}