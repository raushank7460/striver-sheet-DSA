package backTracking;

public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        boolean [][]isVisited=new boolean[rows][cols];
        maze(0,0,rows-1,cols-1,"",isVisited);
        
    }
    public static void maze(int sr,int sc,int er,int ec,String s,boolean[][]isVisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        // go right
        maze(sr, sc+1, er, ec, s+"R", isVisited);
        //go down

        maze(sr+1, sc, er, ec, s+"D", isVisited);
        //left
        maze(sr, sc-1, er, ec, s+"L", isVisited);
        //up
        maze(sr-1, sc, er, ec, s+"U", isVisited);

        //backTacking

        isVisited[sr][sc]=false;

    }
    
}
