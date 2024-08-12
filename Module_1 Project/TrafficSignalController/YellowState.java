public class YellowState extends TrafficSignalState {
    @Override
    public TrafficSignalState nextState() {
        return new RedState();
    }

    @Override
    public String signal() {
        return "Yellow";
    }
}