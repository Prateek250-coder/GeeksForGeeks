//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution obj = new Solution();
            int ans = obj.MaxConnection(grid);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends






class Solution {
     int[][] moves = {{0,1},{0,-1},{1,0},{-1,0}};
    
    boolean isValid(int[][] grid, int i, int j, int n){
        return i<n && i>=0 && j<n && j>=0 && grid[i][j] == 1;
    }
   
   
    public int dfs(int[][] grid, int i, int j, int[][] visited, int n, int color){
        if(!isValid(grid,i,j,n))
            return 0;
            
        if(visited[i][j] != -1)
            return 0;
            
        visited[i][j] = color;
        int sizeOfComponent = 1;
        for(int k=0; k<moves.length; k++){
            sizeOfComponent += dfs(grid, moves[k][0]+i, moves[k][1]+j, visited, n, color);
        }
        
        return sizeOfComponent;
    }
    public int MaxConnection(int grid[][]) {
        // Your code here
        ArrayList<Integer> sizeOfColor = new ArrayList<>();
        int n = grid.length;
        int ans = 0;
        int color = 0;
    
        int[][] visited = new int[n][n];
        for(int[] row : visited){
            Arrays.fill(row, -1);
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if( grid[i][j] == 1){
                    if(visited[i][j] == -1){
                        int sizeOfComponent = dfs(grid, i, j, visited, n, color);
                        sizeOfColor.add(sizeOfComponent);
                        ans = Math.max(sizeOfComponent, ans);
                        color++;
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0){
                    HashSet<Integer> diffSet = new HashSet<>();
                    if(i > 0 && visited[i-1][j] != -1)   
                        diffSet.add(visited[i-1][j]);
                    if(i < n-1 && visited[i+1][j] != -1)   
                        diffSet.add(visited[i+1][j]);
                    if(j > 0 && visited[i][j-1] != -1)   
                        diffSet.add(visited[i][j-1]);
                    if(j < n-1 && visited[i][j+1] != -1)   
                        diffSet.add(visited[i][j+1]);
                        
                    int sizeOfComponent = 1;  
                    for(Integer haveColor : diffSet){
                        sizeOfComponent += sizeOfColor.get(haveColor);
                    }
                    
                    ans = Math.max(ans, sizeOfComponent);
                }
            }
        }
        
        return ans;
    }
}





