import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficSignalControllerTest {
    @Test
    void testInitialSignal() {
        TrafficSignalController controller = new TrafficSignalController();
        assertEquals("Red", controller.getSignal());
    }

    @Test
    void testStateTransition() {
        TrafficSignalController controller = new TrafficSignalController();
        assertEquals("Red", controller.getSignal());
        controller.changeState();
        assertEquals("Green", controller.getSignal());
        controller.changeState();
        assertEquals("Yellow", controller.getSignal());
        controller.changeState();
        assertEquals("Red", controller.getSignal());
    }
}