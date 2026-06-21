package arrays;

public class linearSearch {
    public static int linearSearchs(int[]arr,int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {10, 8, 30, 4, 5};
        int x = 5;
        System.out.println(linearSearchs(arr,x));
    }
    
}
