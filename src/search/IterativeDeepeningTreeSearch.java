package search;

public class IterativeDeepeningTreeSearch implements Search {
    DepthFirstFrontier frontier;

    public int nodeCount = 0;
    public int maxNodeCount = 0;

    public Node findSolution(Node root, GoalTest goalTest) {
        int maxAllowedDepth = 0;

        while(true) {
            maxAllowedDepth++;

            Node ans = depthLimitedSearch(root, goalTest, maxAllowedDepth);

            maxNodeCount = Math.max(maxNodeCount, frontier.performance());

            if(ans != null)
                return ans;
        }
    }

    Node depthLimitedSearch(Node root, GoalTest goalTest, int maxAllowedDepth) {
        frontier = new DepthFirstFrontier();

        frontier.add(root);

        nodeCount++;

        while(!frontier.isEmpty()) {
            Node crt = frontier.remove();

            if(goalTest.isGoal(crt.state))
                return crt;

            for (Action action : crt.state.getApplicableActions()) {
                Node neighbour = new Node(crt, action, crt.state.getActionResult(action), crt.depth + 1);

                if(neighbour.depth > maxAllowedDepth)
                    continue;

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