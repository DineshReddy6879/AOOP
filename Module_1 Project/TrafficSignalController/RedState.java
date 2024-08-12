public class RedState extends TrafficSignalState {
    @Override
    public TrafficSignalState nextState() {
        return new GreenState();
    }

    @Override
    public String signal() {
        return "Red";
    }
}