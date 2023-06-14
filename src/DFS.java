import java.util.*;

public class DFS {
	private Map<Character, List<Character>> graph;
	private int time;
	private Map<Character, Character> color = new HashMap<>();
	private Map<Character, Character> prev = new HashMap<>();
	private Map<Character, Integer> discover_time = new HashMap<>();
	private Map<Character, Integer> finish_time = new HashMap<>();

    public DFS(Map<Character, List<Character>> graph) {
        this.graph = graph;
    }
    
    public void traversal() {
    	
        
        for(char u:graph.keySet()) {
        	color.put(u, 'W');
        	prev.put(u, 'N');
        	discover_time.put(u, -1);
        	finish_time.put(u, -1);
        }
        time = 0;
        for(char u:graph.keySet()) {
        	if(color.get(u)=='W') {
        		DFS_visit(u);
        	}
        }
    }
    
    public void DFS_visit(char u) {
    	color.put(u,'G');
    	time++;
    	discover_time.put(u,time);
    	for(char v:graph.get(u)) {
    		if(color.get(v)=='W') {
    			prev.put(v, u);
    			DFS_visit(v);
    		}
    	}
    	color.put(u, 'B');
    	System.out.print(u);
    	time++;
    	finish_time.put(u, time);
    	
    	
//    	System.out.println("Data: color[V], prev[V], d[V], f[V]");
//        for (char v : graph.keySet()) {
//            System.out.println("color[" + v + "] = " + color.get(v));
//            System.out.println("prev[" + v + "] = " + prev.get(v));
//            System.out.println("d[" + v + "] = " + discover_time.get(v));
//            System.out.println("f[" + v + "] = " + finish_time.get(v));
//        }
    }
}