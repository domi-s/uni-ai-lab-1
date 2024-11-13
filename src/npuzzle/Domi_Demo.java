package npuzzle;

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
		System.out.println("This is a demonstration of iterative deepening tree search on 8-puzzle (Domi's version)");
		System.out.println();

		Tiles initialConfiguration = new Tiles(new int[][] {
			{ 7, 4, 2 },
			{ 8, 1, 3 },
			{ 5, 0, 6 }
		});

		GoalTest goalTest = new TilesGoalTest();

		Node initialNode = new Node(null, null, initialConfiguration);

		IterativeDeepeningTreeSearch iterativeDeepeningTreeSearch = new IterativeDeepeningTreeSearch();

		Node solution = iterativeDeepeningTreeSearch.findSolution(initialNode, goalTest);

		new NPuzzlePrinting().printSolution(solution);

		System.out.println("Node count: " + iterativeDeepeningTreeSearch.nodeCount);
		System.out.println("Max nodes on frontier: " + iterativeDeepeningTreeSearch.maxNodeCount);
	}

	public static void DFGSearch() {
		System.out.println("This is a demonstration of depth-first graph search on 8-puzzle (Domi's version)");
		System.out.println();

		Tiles initialConfiguration = new Tiles(new int[][] {
			{ 7, 4, 2 },
			{ 8, 1, 3 },
			{ 5, 0, 6 }
		});

		GoalTest goalTest = new TilesGoalTest();

		Node initialNode = new Node(null, null, initialConfiguration);

		DepthFirstFrontier depthFirstFrontier = new DepthFirstFrontier();

		GraphSearch graphSearch = new GraphSearch(depthFirstFrontier);

		Node solution = graphSearch.findSolution(initialNode, goalTest);

		new NPuzzlePrinting().printSolution(solution);

		System.out.println("Node count: " + graphSearch.performance());
		System.out.println("Max nodes on frontier: " + depthFirstFrontier.performance());
	}

	public static void DFTSearch() {
		System.out.println("This is a demonstration of depth-first tree search on 8-puzzle (Domi's version)");
		System.out.println();

		Tiles initialConfiguration = new Tiles(new int[][] {
			{ 7, 4, 2 },
			{ 8, 1, 3 },
			{ 5, 0, 6 }
		});

		GoalTest goalTest = new TilesGoalTest();

		Node initialNode = new Node(null, null, initialConfiguration);

		DepthFirstFrontier depthFirstFrontier = new DepthFirstFrontier();

		TreeSearch treeSearch = new TreeSearch(depthFirstFrontier);

		Node solution = treeSearch.findSolution(initialNode, goalTest);

		new NPuzzlePrinting().printSolution(solution);

		System.out.println("Node count: " + treeSearch.performance());
		System.out.println("Max nodes on frontier: " + depthFirstFrontier.performance());
	}

	public static void BFGSearch() {
		System.out.println("This is a demonstration of breadth-first graph search on 8-puzzle (Domi's version)");
		System.out.println();

		Tiles initialConfiguration = new Tiles(new int[][] {
			{ 7, 4, 2 },
			{ 8, 1, 3 },
			{ 5, 0, 6 }
		});

		GoalTest goalTest = new TilesGoalTest();

		Node initialNode = new Node(null, null, initialConfiguration);

		BreadthFirstFrontier breadthFirstFrontier = new BreadthFirstFrontier();

		GraphSearch graphSearch = new GraphSearch(breadthFirstFrontier);

		Node solution = graphSearch.findSolution(initialNode, goalTest);

		new NPuzzlePrinting().printSolution(solution);

		System.out.println("Node count: " + graphSearch.performance());
		System.out.println("Max nodes on frontier: " + breadthFirstFrontier.performance());
	}

	public static void BFTSearch() {
		System.out.println("This is a demonstration of breadth-first tree search on 8-puzzle (Domi's version)");
		System.out.println();

		Tiles initialConfiguration = new Tiles(new int[][] {
			{ 7, 4, 2 },
			{ 8, 1, 3 },
			{ 5, 0, 6 }
		});

		GoalTest goalTest = new TilesGoalTest();

		Node initialNode = new Node(null, null, initialConfiguration);

		BreadthFirstFrontier breadthFirstFrontier = new BreadthFirstFrontier();

		TreeSearch treeSearch = new TreeSearch(breadthFirstFrontier);

		Node solution = treeSearch.findSolution(initialNode, goalTest);

		new NPuzzlePrinting().printSolution(solution);

		System.out.println("Node count: " + treeSearch.performance());
		System.out.println("Max nodes on frontier: " + breadthFirstFrontier.performance());
	}
}
