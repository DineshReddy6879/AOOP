public class Main {
    public static void main(String[] args) {
        TrafficSignalController controller = new TrafficSignalController();

        for (int i = 0; i < 10; i++) {
            System.out.println("Signal: " + controller.getSignal());
            controller.changeState();
        }
    }
}