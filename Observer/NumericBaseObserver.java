
import java.util.List;
public interface NumericBaseObserver {
    void updateState(int value);
    List<String> getEvents();
}