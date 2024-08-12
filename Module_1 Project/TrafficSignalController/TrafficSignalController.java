public class TrafficSignalController {
    private TrafficSignalState state;

    public TrafficSignalController() {
        this.state = new RedState();
    }

    public void changeState() {
        this.state = state.nextState();
    }

    public String getSignal() {
        return state.signal();
    }
}