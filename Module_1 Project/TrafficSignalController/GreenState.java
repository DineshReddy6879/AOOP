public class GreenState extends TrafficSignalState {
    @Override
    public TrafficSignalState nextState() {
        return new YellowState();
    }

    @Override
    public String signal() {
        return "Green";
    }
}