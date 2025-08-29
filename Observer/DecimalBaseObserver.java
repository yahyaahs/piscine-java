

import java.util.List;
import java.util.ArrayList;

public class DecimalBaseObserver implements NumericBaseObserver {

        private List<String> events = new ArrayList<>();

    public void updateState(int state) {
        String decimalString = Integer.toString(state);
        events.add(decimalString);
    }
    public List<String> getEvents() {
        return events;
    }
}