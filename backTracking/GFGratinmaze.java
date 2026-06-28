package backTracking;

public class GFGratinmaze {
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
        print(0,0,rows-1,cols-1,"",isVisited,maze);

        
    }
    public static void print(int sr,int sc,int er,int ec,String s,boolean[][]isVisited,int[][]maze){
        if(sr<0 || sc<0 || sr>er || sc>ec) return;
        if(maze[sr][sc]==0)return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(isVisited[sr][sc])return;
        isVisited[sr][sc]=true;
        print(sr, sc+1, er, ec, s+"R", isVisited, maze);
        print(sr+1, sc, er, ec, s+"D", isVisited, maze);
        print(sr, sc-1, er, ec, s+"L", isVisited, maze);
        print(sr-1, sc, er, ec, s+"U", isVisited, maze);
        isVisited[sr][sc]=false;

        

    }
    
}
