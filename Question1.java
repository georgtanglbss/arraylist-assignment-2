import java.util.ArrayList;

class Question1{
    public static ArrayList<Integer> func1(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=2;i<=n;i++){
            arr.add(i);
        }
        int p = 0;
        while(p<arr.size()){
            for(int i=p+1; i<arr.size(); i++){
                if(arr.get(i) % arr.get(p) == 0){
                    arr.remove(i);
                    i--;
                }
            }
            p++;
        }
        return arr;
    }

    public static void main (String[] args) {
        ArrayList<Integer> result = func1(100);
        //for(int i:result){
            System.out.println(result);
        //}
    }
}