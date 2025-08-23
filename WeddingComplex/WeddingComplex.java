import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.*;;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(
        Map<String, List<String>> first,
        Map<String, List<String>> second
    ) {
        Map<String, Map<String, Integer>> receiverank = new HashMap<>();
        for (var entry : second.entrySet()) {
            Map<String, Integer> rank = new HashMap<>();
            List<String> prefs = entry.getValue();
            for (int i = 0; i < prefs.size(); i++) {
                rank.put(prefs.get(i), i);
            }
            receiverank.put(entry.getKey(), rank);
        }

        Map<String, String> matches = new HashMap<>();
        Map<String, Integer> propnext = new HashMap<>();
        for (String p : first.keySet()) {
            propnext.put(p, 0);
        }

        Set<String> free = new HashSet<>(first.keySet());

        while (!free.isEmpty()) {
            Iterator<String> freeiter = free.iterator();
            String proposer = freeiter.next();
            freeiter.remove();

            List<String> prefs = first.get(proposer);
            int choiceInx = propnext.get(proposer);
            if (choiceInx >= prefs.size()) {
                continue;
            }

            String receiver = prefs.get(choiceInx);
            propnext.put(proposer, choiceInx + 1);

            if (!matches.containsKey(receiver)) {
                matches.put(receiver, proposer);
            } else {
                String currentProp = matches.get(receiver);
                Map<String, Integer> rank = receiverank.get(receiver);
                if (rank.get(proposer) < rank.get(currentProp)) {
                    matches.put(receiver, proposer);
                    free.add(currentProp);
                }else{
                    free.add(proposer);
                }
            }
        }

        Map<String, String> res = new HashMap<>();
        for (var entry : matches.entrySet()) {
            res.put(entry.getValue(), entry.getKey());
        }
        return res;
    }
}
