package Graph;
import java.util.LinkedList;
import java.util.Queue;
public class BFSGraphs {
		static class Graph{
			 int Vertices;
			 LinkedList<Integer>[] adjlist; 
			Graph(int Vertices){
				this.Vertices=Vertices;
				adjlist=new LinkedList[Vertices];
				
				for(int i=0;i<Vertices;i++) {
					adjlist[i]=new LinkedList<Integer>();
				}
			}
			// Add the Edges
			void AddEdges(int u, int v) {
				adjlist[u].add(v);
				adjlist[v].add(u);
			}
			void BFS(int start) {
				boolean[] Visited=new boolean[Vertices];
				Queue<Integer> queue=new LinkedList<>();
				Visited[start]=true;
				queue.add(start);
				while(!queue.isEmpty()) {
					int node=queue.poll();
					System.out.print(node+" ");
					for(int negibours : adjlist[node]) {
						if(!Visited[negibours]) {
							Visited[negibours]=true;
							queue.add(negibours);
						}
					}
				}
			}
			
			void DFS(int start) {
				boolean[] Visited=new boolean[Vertices];
				helperDfs(start,Visited);
			}
			void helperDfs(int node,boolean[] Visited ) {
				Visited[node]=true;
				System.out.print(node+" ");
				for(int negibours : adjlist[node]) {
					if(!Visited[negibours]) {
						Visited[negibours]=true;
						helperDfs(negibours,Visited);
					}
				}
				
			}
		}
	public static void main(String[] args) {
		Graph g=new Graph(13);        
		g.AddEdges(5, 7);
		g.AddEdges(5, 8);
		g.AddEdges(5, 2);
		g.AddEdges(7, 1);
		g.AddEdges(7, 3);
		g.AddEdges(8, 4);
		g.AddEdges(8, 9);
		g.AddEdges(2, 10);
		g.AddEdges(2, 12);
		System.out.print("\nTraverse of BFS \n");
		g.BFS(10);
		
		System.out.print("\nTraverse of DFS \n");
		g.DFS(10);
		
	}
}
//                              5
//                              
//                           7      8      2
//                           
//                       1     3   4  9  10   12
                       