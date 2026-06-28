package backTracking;

public class ratInMaze {
    public static void main(String[] args) {
        int [][]maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1}, 
                {1, 1, 0, 0}, 
                {0, 1, 1, 1}
         };
         int rows=maze.length;

         int cols=maze[0].length;
         boolean[][]isVisited=new boolean[rows][cols];
         print(0,0,rows-1,cols-1,"",maze,isVisited);
         
    }
    public static void print(int sr,int sc,int er,int ec ,String s,int[][]maze,boolean[][]isVisited){
    //    boundry check
        if(sr<0 || sc<0 || sr>er || sc>ec) return;
        // blocked cell
        if(maze[sr][sc]==0) return;
        // visited checl
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        // right
        print(sr, sc+1, er, ec, s+"R", maze, isVisited);
        // down
        print(sr+1, sc, er, ec, s+"D", maze, isVisited);
        // left
        print(sr, sc-1, er, ec, s+"L", maze, isVisited);
        // up
        print(sr-1, sc, er, ec, s+"U", maze, isVisited);
        isVisited[sr][sc]=false;
    }

    
    
    
}
