import human.Person;
import human.Problem;
import human.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void addProblem_personHaveAProblem(){
        Person person = new Person();
        Problem problem = new Problem("Transport fare", Type.FINANCIAL);
        person.addProblem(problem);
        assertEquals(1, person.getSizeOfProblem());

    }

    @Test
    public void addTwoProblemTest(){
        Person person = new Person();
        Problem problem = new Problem("Feeding money", Type.FINANCIAL);
        Problem problem1 = new Problem("School fees", Type.EDUCATION);
        person.addProblem(problem);
        person.addProblem(problem1);
        assertEquals(2, person.getSizeOfProblem());
    }

    @Test
    public void addProblem_removeProblemTest(){
        Person person = new Person();
        Problem problem = new Problem("Start up money", Type.BUSINESS);
        person.addProblem(problem);
        person.solve(problem);
        assertEquals(0, person.getSizeOfProblem());

    }

    @Test
    public void addTwoProblem_removeOneProblemTest(){
        Person person = new Person();
        Problem problem = new Problem("Start up money", Type.BUSINESS);
        Problem problem1 = new Problem("Feeding money", Type.FINANCIAL);
        person.addProblem(problem);
        person.addProblem(problem1);
        person.solve(problem);
        assertEquals(1, person.getSizeOfProblem());

    }

    @Test
    public void addThreeProblem_removeOneProblem_recountProblemTest(){
        Person person = new Person();
        Problem problem = new Problem("Money", Type.FINANCIAL);
        Problem problem1 = new Problem("School fee", Type.EDUCATION);
        Problem problem2 = new Problem("Start up money", Type.BUSINESS);
        person.addProblem(problem);
        person.addProblem(problem1);
        person.addProblem(problem2);
        person.solve(problem);
        person.reCount();
        assertEquals(2, person.getSizeOfProblem());

    }

    @Test
    public void addProblem_solveProblem_problemIsSolvedTest(){
        Person person = new Person();
        Problem problem = new Problem("Feeding money", Type.FINANCIAL);
        person.addProblem(problem);
        person.solve(problem);
        assertFalse(person.isSolve());
    }
    @Test
    public void addTwoProblem_solveOneAndGetTheUnsolved(){
        Person person = new Person();
        Problem problem = new Problem("School fees", Type.EDUCATION);
        Problem problem1 = new Problem("Feeding money", Type.FINANCIAL);
        person.addProblem(problem);
        person.addProblem(problem1);
        person.solve(problem);
        assertFalse(person.isSolve());
    }

}

