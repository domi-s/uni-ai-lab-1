package search;

import java.util.HashSet;
import java.util.Set;

public class GraphSearch implements Search {
    Frontier frontier;

    int nodeCount = 0;

    public GraphSearch(Frontier frontierInit) {
        frontier = frontierInit;
    }
    public Node findSolution(Node root, GoalTest goalTest) {
        frontier.add(root);

        nodeCount = 1;

        Set<State> visitedStates = new HashSet<State>();

        while(!frontier.isEmpty()) {
            Node crt = frontier.remove();

            if(goalTest.isGoal(crt.state))
                return crt;

            for (Action action : crt.state.getApplicableActions()) {
                Node neighbour = new Node(crt, action, crt.state.getActionResult(action));

                if(visitedStates.contains(neighbour.state))
                    continue;

                visitedStates.add(neighbour.state);

                frontier.add(neighbour);
                nodeCount++;
            }
        }
        return null;
    }

    public int performance() {
        return nodeCount;
    }
}