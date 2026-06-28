package backTracking;



public class printPath {
    public static void main(String[] args) {
        int rows=5;
        int cols=3;
        maze(1, 1, rows, cols ,"");
        
    }
    public static void maze(int sr,int sc,int er,int ec,String s){
        if(sr>er || sc>ec) return ;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
        maze(sr+1, sc, er, ec, s+"D");
        maze(sr, sc+1, er, ec, s+"R");

        
    }
    
}
