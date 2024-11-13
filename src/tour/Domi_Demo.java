package tour;

import search.*;

public class Domi_Demo {
	public static void main(String[] args) {
//		BFTSearch();
//		BFGSearch();
//		DFTSearch();
//		DFGSearch();
		IDTSearch();
	}

	public static void IDTSearch() {
		System.out.println("This is a demonstration of iterative deepening tree search on Romania tour (Domi's version)");
		System.out.println();

		Cities romania = SetUpRomania.getRomaniaMapSmall();
		City startCity = romania.getState("Bucharest");

        GoalTest goalTest = new TourGoalTest(romania.getAllCities(), startCity);

		Node initialNode = new Node(null, null, new TourState(startCity));

		IterativeDeepeningTreeSearch iterativeDeepeningTreeSearch = new IterativeDeepeningTreeSearch();

		Node solution = iterativeDeepeningTreeSearch.findSolution(initialNode, goalTest);

		new TourPrinting().printSolution(solution);

		System.out.println("Node count: " + iterativeDeepeningTreeSearch.nodeCount);
		System.out.println("Max nodes on frontier: " + iterativeDeepeningTreeSearch.maxNodeCount);
	}

	public static void DFGSearch() {
		System.out.println("This is a demonstration of depth-first graph search on Romania tour (Domi's version)");
		System.out.println();

		Cities romania = SetUpRomania.getRomaniaMapSmall();
		City startCity = romania.getState("Bucharest");

        GoalTest goalTest = new TourGoalTest(romania.getAllCities(), startCity);

		Node initialNode = new Node(null, null, new TourState(startCity));

		DepthFirstFrontier depthFirstFrontier = new DepthFirstFrontier();

		GraphSearch graphSearch = new GraphSearch(depthFirstFrontier);

		Node solution = graphSearch.findSolution(initialNode, goalTest);

		new TourPrinting().printSolution(solution);

		System.out.println("Node count: " + graphSearch.performance());
		System.out.println("Max nodes on frontier: " + depthFirstFrontier.performance());
	}

	public static void DFTSearch() {
		System.out.println("This is a demonstration of depth-first tree search on Romania tour (Domi's version)");
		System.out.println();

		Cities romania = SetUpRomania.getRomaniaMapSmall();
		City startCity = romania.getState("Bucharest");

        GoalTest goalTest = new TourGoalTest(romania.getAllCities(), startCity);

		Node initialNode = new Node(null, null, new TourState(startCity));

		DepthFirstFrontier depthFirstFrontier = new DepthFirstFrontier();

		TreeSearch treeSearch = new TreeSearch(depthFirstFrontier);

		Node solution = treeSearch.findSolution(initialNode, goalTest);

		new TourPrinting().printSolution(solution);

		System.out.println("Node count: " + treeSearch.performance());
		System.out.println("Max nodes on frontier: " + depthFirstFrontier.performance());
	}

	public static void BFGSearch() {
		System.out.println("This is a demonstration of breadth-first graph search on Romania tour (Domi's version)");
		System.out.println();

		Cities romania = SetUpRomania.getRomaniaMapSmall();
		City startCity = romania.getState("Bucharest");

        GoalTest goalTest = new TourGoalTest(romania.getAllCities(), startCity);

		Node initialNode = new Node(null, null, new TourState(startCity));

		BreadthFirstFrontier breadthFirstFrontier = new BreadthFirstFrontier();

		GraphSearch graphSearch = new GraphSearch(breadthFirstFrontier);

		Node solution = graphSearch.findSolution(initialNode, goalTest);

		new TourPrinting().printSolution(solution);

		System.out.println("Node count: " + graphSearch.performance());
		System.out.println("Max nodes on frontier: " + breadthFirstFrontier.performance());
	}

	public static void BFTSearch() {
		System.out.println("This is a demonstration of breadth-first tree search on Romania tour (Domi's version)");
		System.out.println();

		Cities romania = SetUpRomania.getRomaniaMapSmall();
		City startCity = romania.getState("Bucharest");

        GoalTest goalTest = new TourGoalTest(romania.getAllCities(), startCity);

		Node initialNode = new Node(null, null, new TourState(startCity));

		BreadthFirstFrontier breadthFirstFrontier = new BreadthFirstFrontier();

		TreeSearch treeSearch = new TreeSearch(breadthFirstFrontier);

		Node solution = treeSearch.findSolution(initialNode, goalTest);

		new TourPrinting().printSolution(solution);

		System.out.println("Node count: " + treeSearch.performance());
		System.out.println("Max nodes on frontier: " + breadthFirstFrontier.performance());
	}
}