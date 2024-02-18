import java.util.*;

class Candidate {
    private String name;
    private boolean isLocal;

    public Candidate(String name, boolean isLocal) {
        this.name = name;
        this.isLocal = isLocal;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public String getName() {
        return name;
    }
}

public class InterviewOrder {
    public static void main(String[] args) {
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("chaai", false));  
        candidates.add(new Candidate("visve", true));  
        candidates.add(new Candidate("malan", true));
        candidates.add(new Candidate("anudeep", false));  
        candidates.add(new Candidate("moha", false));  
        candidates.add(new Candidate("nagulesh", true));


        candidates.sort(Comparator.comparing(Candidate::isLocal));

        System.out.println("Order of Interviews:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + " - " + (candidate.isLocal() ? "Local" : "Non-local"));
        }
    }
}
