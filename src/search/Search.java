package search;

public interface Search {
    Node findSolution(Node root, GoalTest goalTest);

    // Performance measure
    int performance();
}