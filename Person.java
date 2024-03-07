import java.util.ArrayList;
import java.util.List;

public class Person {
    private final List<Problem> problems = new ArrayList<>();


    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public void solve(Problem problem) {
        problems.remove(problem);
    }
    public int getSizeOfProblem() {
        return problems.size();
    }

    public List<Problem> reCount() {
        return problems;
    }

    public boolean isSolve() {
        System.out.println(problems);
        return Problem.isSolve;
    }
}
