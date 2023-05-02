/*
 * Simple Graph implementation using Java primitives.
 * 
 */

/**
 *
 * @author George Fountis, Spring 2023.
 */
public class Graph {
    private int[][] adjMatrix;
    public Graph(int numberOfVertexes) {
    
        // we like to keep things neat, and label our vertexes a..z
        if (numberOfVertexes > 26 || numberOfVertexes < 1) { 
            System.out.println("Error, invalid number of vertexes (must be 1-26).");
            System.exit(1);
        }
    
        else {
            
             adjMatrix = new int[numberOfVertexes][numberOfVertexes]; 
             
            for (int x=0; x < numberOfVertexes; x++) {
              for (int y=0; y < numberOfVertexes; y++) {
                adjMatrix[x][y] = 0;
                }
            }
            
            
        }
    }
    /**
     * We do a pretty print here, with labels.
     */
    public void printAdjMatrix() {
        int a = 97;
        System.out.print("  ");
        for (int i = 0;i < this.adjMatrix.length; i++) {
            a = 97 + i;
            System.out.print((char) a );
        }
        System.out.println();
        
        for (int x=0; x < this.adjMatrix.length; x++) {
            a = 97 + x;
            System.out.print((char) a + " ");
            for (int y=0; y < this.adjMatrix.length ; y++) {
                
                System.out.print(this.adjMatrix[x][y]);
                }
            System.out.println();
            }
        
    }
    
       
    /**
     * Add an edge from vertex v1, to vertex v2. 
     * The vertexes are accessed as chars, 'a','b','c' .. 
     * all the way to 'z', so it's easier to write them on paper.
     * 
     * We could also use this to add directed edges, by not updating [y][x].
     *       
     * @param v1
     * @param v2 
     */
    public void addE(char v1, char v2) {
        
        int x = v1 - 97;
        int y = v2 - 97;
        this.adjMatrix[x][y] += 1; 
         // Update this only if it's not a loop. 
        if (v1 != v2)
            this.adjMatrix[y][x] += 1;
        
        
    }
    public void delE(char v1, char v2) {
        int x = v1 - 97;
        int y = v2 - 97;
        if (this.adjMatrix[x][y] != 0 && this.adjMatrix[y][x] !=0) {
            
            this.adjMatrix[x][y] -= 1; 
            // Update this only if it's not a loop. 
            if (v1 != v2) 
                this.adjMatrix[y][x] -= 1;
            
        } 
            
    }
    
    public boolean existsE(char v1, char v2) {
        int x = v1 - 97; 
        int y = v2 - 97;
        if (this.adjMatrix[x][y] !=0 || this.adjMatrix[y][x] !=0) 
        {return true;} else {return false;}
        
        
    }
    
    public int degV(char v1) {
        int x = v1 - 97;
        int degrees = 0;
        for (int i=0; i < this.adjMatrix.length ; i++) {
            degrees += this.adjMatrix[x][i];
        }
        return degrees;
    }
    
    public char[] getE(char v1) {
       
        int row = v1 - 97; // if 'a' then row=0, if 'b' then row=1, etc.
        int degrees = this.degV(v1);
        char edges[] = new char[degrees];
        int index = -1;
        
            for (int col=0; col < this.adjMatrix.length; col++) { // get all elements of row.
     
                if (this.adjMatrix[row][col] >0) { // if element is > 0, then there's an edge between v1 and the vertex row label (a=0, b=1, etc).
                    
                    int edges_howmany = this.adjMatrix[row][col];
                    for (int e=0; e < edges_howmany; e++) { // loop 
                        index++;
                        int to_vertex = col + 97;
                        edges[index] = (char) to_vertex;    
                    }
                    
                }
                    
            }
            
            return edges;
    }
           
    
}

