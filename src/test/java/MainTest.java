import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Disabled
    @Test
    void calculateAverageTest() {

        List<Camera> emptyList = new ArrayList<>();
        assertEquals(0, Main.calculateAverage(emptyList));

        List<Camera> testList1 = testList1();
        assertEquals(4870, Main.calculateAverage(testList1));

        List<Camera> testList2 = testList2();
        assertEquals(5533, Main.calculateAverage(testList2));

        List<Camera> testList3 = testList3();
        assertEquals(10, Main.calculateAverage(testList3));

    }

    @Disabled
    @Test
    void takePhotographsTest() {

        List<Camera> emptyList = new ArrayList<>();
        String expectedOutput = "";
        Main.takePhotographs(emptyList);
        assertEquals(expectedOutput, outputStream.toString());

        List<Camera> testList1 = testList1();
        expectedOutput = "Taking a picture on my digital camera!\n" +
                "Taking a picture on my polaroid camera!\n" +
                "Taking a picture!\n";
        Main.takePhotographs(testList1);
        assertEquals(expectedOutput, outputStream.toString());
    }

    private List<Camera> testList1() {
        List<Camera> cameras = new ArrayList<>();
        cameras.add(new DigitalCamera());
        cameras.add(new PolaroidCamera());
        cameras.add(new PhoneCamera());

        return cameras;
    }

    private List<Camera> testList2() {
        List<Camera> cameras = new ArrayList<>();
        cameras.add(new DigitalCamera());
        cameras.add(new PhoneCamera());
        cameras.add(new DigitalCamera());

        return cameras;
    }

    private List<Camera> testList3() {
        List<Camera> cameras = new ArrayList<>();
        cameras.add(new PolaroidCamera());
        cameras.add(new PolaroidCamera());
        cameras.add(new PolaroidCamera());

        return cameras;
    }
}