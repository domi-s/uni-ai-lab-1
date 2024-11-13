package search;

public class TreeSearch implements Search {
    Frontier frontier;

    int nodeCount = 0;

    public TreeSearch(Frontier frontierInit) {
        frontier = frontierInit;
    }

    public Node findSolution(Node root, GoalTest goalTest) {
        frontier.add(root);

        nodeCount = 1;

        while(!frontier.isEmpty()) {
            Node crt = frontier.remove();

            if(goalTest.isGoal(crt.state))
                return crt;

            for (Action action : crt.state.getApplicableActions()) {
                Node neighbour = new Node(crt, action, crt.state.getActionResult(action));
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