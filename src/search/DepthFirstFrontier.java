package search;

import java.util.Stack;

// Task 1: DepthFirstFrontier interface

public class DepthFirstFrontier implements Frontier {
    int nodeCount = 0, maxNodeCount = 0;
    Stack<Node> frontierNodes = new Stack<>();

    public void add(Node node) {
        frontierNodes.push(node);

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

        return frontierNodes.pop();
    }

    public int performance() {
        return maxNodeCount;
    }
}