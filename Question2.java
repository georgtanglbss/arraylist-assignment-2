import java.util.ArrayList;

class Question2{
    public static ArrayList<Integer> func1(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=2;i<=n;i++){
            arr.add(i);
        }
        int pIdx = 0;
        while(pIdx<arr.size()){
            for(int i=pIdx+1; i<arr.size(); i++){
                if(arr.get(i)%arr.get(pIdx) == 0){
                    arr.remove(i);
                    i--;
                }
            }
            pIdx++;
        }
        return arr;
    }
    public static void func2(int sum){
        ArrayList<Integer> arr = func1(sum);
        //System.out.println(arr);
        int l = 0;
        int r = arr.size()-1;
        while(l<r){
            int numL = arr.get(l);
            int numR = arr.get(r);
            if(numL+numR == sum){
                System.out.println(sum + " = " + numL + " + " + numR);
                return;
            }
            else if(numL+numR > sum){
                r--;
            }
            else{
                l++;
            }
        }
     }
     public static void main (String[] args) {
        for (int i = 4; i <= 100; i += 2) {
            func2(i);
        }
    }
}
