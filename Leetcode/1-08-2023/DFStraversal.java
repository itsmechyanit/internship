import java.util.ArrayList;
import java.util.Arrays;

public class DFStraversal {
  public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        //To determine if a vertex is visited or not
        boolean[] visited = new boolean[V];
        //holds the final answer
        ArrayList<Integer> ans = new ArrayList<>();
        dfsOfGraphHelper(ans,adj,visited,0);
        return ans;
    }

    private void dfsOfGraphHelper(ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int currentVertex){
     //add the current vertex to the answer
      ans.add(currentVertex);
       //mark the current vertex as visited
        visited[currentVertex] = true;
        //get all the verices attached to the current vertex
        for(Integer vertex: adj.get(currentVertex)){
            //if the vertex is not visited make a recursive call
            if(!visited[vertex]){
                dfsOfGraphHelper(ans,adj,visited,vertex);
            }
        }
    }

    public static void main(String[] args) {
        DFStraversal dfs = new DFStraversal();
        System.out.println("Testing the first test case");
        ArrayList<ArrayList<Integer> >adj1 = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(3);
        a1.add(1);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(0);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(0);
        a3.add(4);
        ArrayList<Integer> a4 = new ArrayList<>();
        a4.add(0);
        ArrayList<Integer> a5 = new ArrayList<>();
        a5.add(2);


        adj1.add(a1);
        adj1.add(a2);
        adj1.add(a3);
        adj1.add(a4);
        adj1.add(a5);
        int V1 = 5;

        ArrayList<Integer> ans1 = dfs.dfsOfGraph(V1, adj1);
        System.out.println(ans1);
        System.out.println("Testing the second test case");
        ArrayList<ArrayList<Integer> >adj2 = new ArrayList<>();
        ArrayList<Integer> a6 = new ArrayList<>();
        a6.add(1);
        a6.add(3);
        
        ArrayList<Integer> a7 = new ArrayList<>();
        a7.add(2);
        a7.add(0);
        ArrayList<Integer> a8 = new ArrayList<>();
        a8.add(1);
        
        ArrayList<Integer> a9 = new ArrayList<>();
        a9.add(0);
        


        adj2.add(a6);
        adj2.add(a7);
        adj2.add(a8);
        adj2.add(a9);
        
        int V2 = 4;

        ArrayList<Integer> ans2 = dfs.dfsOfGraph(V2, adj2);
        System.out.println(ans2);

    }
}
