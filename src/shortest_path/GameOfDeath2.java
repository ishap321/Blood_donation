package shortest_path;

public class GameOfDeath2 {

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
	
}
