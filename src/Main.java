import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<Character, List<Character>> adjList = new HashMap<>();
        adjList.put('S', Arrays.asList('A','B','C'));
        adjList.put('A', Arrays.asList('B', 'C'));
        adjList.put('B', Arrays.asList('S'));
        adjList.put('C', Arrays.asList('B'));
        adjList.put('D', Arrays.asList('E','C'));
        adjList.put('E', Arrays.asList('C'));
        adjList.put('F', Arrays.asList('D','E','G'));
        adjList.put('G', Arrays.asList('C'));

        DFS dfs = new DFS(adjList);
        dfs.traversal();
	}
}