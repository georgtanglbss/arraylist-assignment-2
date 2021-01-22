import java.util.ArrayList;
class Question3{
    public static ArrayList<Integer> func3(int a, int b){
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int carrier = 0;
        //round 1: ret = [2], carrier = 1, a = 12, b = 49
        //round 2: ret = [2,2], carrier = 1, a = 1, b = 4
        //round 3: ret = [6,2,2], carrier = 0, a = 0, b = 0
        while(a>0 || b>0 || carrier!=0){
            int sum = a%10 + b%10 + carrier;
            int toAdd = sum%10;
            carrier = sum/10;
            ret.add(0, toAdd);
            a/=10;
            b/=10;
        }
        
        return ret;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ret = func3(2147483647,2147483646);
        System.out.println(ret);
    }
}

