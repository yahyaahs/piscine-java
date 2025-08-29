
import java.util.ArrayList;
import java.util.List;

public class HexaBaseObserver implements NumericBaseObserver {

        private List<String> events= new ArrayList<>();

    public void updateState(int state) {
        String hexString = Integer.toHexString(state);
        events.add(hexString);
    }
    public List<String> getEvents() {
        return events;
    }
}