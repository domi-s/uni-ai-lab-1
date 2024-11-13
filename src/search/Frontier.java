package search;

// Task 1: Frontier interface

public interface Frontier {
    // Add a node to the frontier
    void add(Node node);

    // Clear the contents of the frontier
    void clear();

    // Test whether the frontier is empty
    boolean isEmpty();

    // Remove a node from the frontier, if it is not empty
    Node remove();

    // Performance measure
    int performance();
}