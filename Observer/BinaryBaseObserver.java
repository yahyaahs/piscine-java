import java.util.List;
import java.util.ArrayList;

public class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();

    public void updateState(int state) {
        String binaryString = Integer.toBinaryString(state);
        events.add(binaryString);
    }
    public List<String> getEvents() {
        return events;
    }
}

