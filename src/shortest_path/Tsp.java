package shortest_path;

import java.util.Scanner;

public class Tsp {

	static int tsp(int[][] graph, boolean[] v, int currPos, int n, int count, int cost, int ans) {

		// If last node is reached and it has a link
		// to the starting node i.e the source then
		// keep the minimum value out of the total cost
		// of traversal and "ans"
		// Finally return to check for more possible values
		if (count == n && graph[currPos][0] > 0) {
			ans = Math.min(ans, cost + graph[currPos][0]);
			return ans;
		}

		// BACKTRACKING STEP
		// Loop to traverse the adjacency list
		// of currPos node and increasing the count
		// by 1 and cost by graph[currPos,i] value
		for (int i = 0; i < n; i++) {
			if (v[i] == false && graph[currPos][i] > 0) {

				// Mark as visited
				v[i] = true;
				ans = tsp(graph, v, i, n, count + 1, cost + graph[currPos][i], ans);

				// Mark ith node as unvisited
				v[i] = false;
			}
		}
		return ans;
	}
	
	static int[][] nextGeneration(int grid[][], int M, int N) 
    { 
    	int[][] future = new int[M][N]; 
        // Loop through every cell 
        for (int l = 1; l < M - 1; l++) 
        { 
            for (int m = 1; m < N - 1; m++) 
            { 
                // finding no Of Neighbours that are alive 
                int aliveNeighbours = 0; 
                for (int i = -1; i <= 1; i++) {
                	for (int j = -1; j <= 1; j++) {
                		aliveNeighbours += grid[l + i][m + j];
                	}
                }       
                // The cell needs to be subtracted from 
                // its neighbours as it was counted before 
                aliveNeighbours -= grid[l][m]; 

  
                // Implementing the Rules of Game of death
                // Cell is lonely and dies (only one live cell)
                if ((grid[l][m] == 1) && (aliveNeighbours < 2)) 
                    future[l][m] = 0; 
                // Cell dies due to over population (if more than 3 live cells)
                else if ((grid[l][m] == 1) && (aliveNeighbours > 3)) 
                    future[l][m] = 0; 
                // A new cell is born ()if two or more live cells are present
                else if ((grid[l][m] == 0) && (aliveNeighbours == 3)) 
                    future[l][m] = 1; 
                // Remains the same 
                else
                    future[l][m] = grid[l][m]; 
            } 
        } 
        
        
        //nextGeneration(future, M, N);
        return future;
    }

// Driver code 
	public static void main(String[] args) {

		// n is the number of nodes i.e. V
		int n = 3;
		int d1,d2,d3;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the Distance from home to shop1");
		d1= scan.nextInt();

		System.out.println("Enter the Distance from home to shop2");
		d2=scan.nextInt();

		System.out.println("Enter the Distance between shops");
		d3=scan.nextInt();
		scan.close();
		
		int[][] graph = { { 0, d1, d2 },
						  { d1, 0, d3 },
						  { d2,d3, 0 } };

		// Boolean array to check if a node
		// has been visited or not
		boolean[] v = new boolean[n];

		// Mark 0th node as visited
		v[0] = true;
		int ans = Integer.MAX_VALUE;
		
		// Find the minimum weight Hamiltonian Cycle
		ans = tsp(graph, v, 0, n, 1, 0, ans);

		
		System.out.println(ans);
	}

}
