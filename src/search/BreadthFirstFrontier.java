package search;

import java.util.LinkedList;
import java.util.Queue;

// Task 1: BreadthFirstFrontier interface

public class BreadthFirstFrontier implements Frontier {
    int nodeCount = 0, maxNodeCount = 0;

    Queue<Node> frontierNodes = new LinkedList<>();

    public void add(Node node) {
        frontierNodes.add(node);

        nodeCount++;
        if(maxNodeCount < nodeCount)
            maxNodeCount = nodeCount;
    }

    public void clear() {
        frontierNodes.clear();

        nodeCount = 0;
    }

    public boolean isEmpty() {
        return frontierNodes.isEmpty();
    }

    public Node remove() {
        nodeCount--;

        return frontierNodes.remove();
    }

    public int performance() {
        return maxNodeCount;
    }
}