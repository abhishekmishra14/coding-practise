package codingpractise.datastructure;

public class Graph {

	class Vertex {
		private String name;

		public Vertex(String name) {
			super();
			this.name = name;
		}
	}

	class Edge {
		private Vertex source;
		private Vertex destination;

		public Edge(Vertex source, Vertex destination) {
			super();
			this.source = source;
			this.destination = destination;
		}
	}

	public void insert(String source, String dest) {
		insertVertex(new Vertex(source), new Vertex(dest));
	}

	private void insertVertex(Vertex vertex, Vertex vertex2) {

	}

	public void traverseGraph(Vertex root) {
		breadthFirstSearch(root);
		depthFirstSearch(root);
	}

	private void depthFirstSearch(Vertex root) {

	}

	private void breadthFirstSearch(Vertex root) {

	}
}
