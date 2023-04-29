public class Reverse {

    public int reverse(int x){
        if(x >= 0 && x < 10) return x;
        int ans = 0;
        int temp = x;
        if(temp < 0){
            temp = temp * -1;
        }
        while(temp > 0){
            int r = temp % 10;
            temp = temp/10;
            if(ans * 10 + r < Integer.MAX_VALUE){
                ans = ans * 10 + r;
            }
            else{
                return 0;
            }
        }

        if(x < 0){
            return -ans;
        }

        

        return ans;
    }

    public static void main(String[] args) {
        Reverse rv = new Reverse();
        System.out.println(rv.reverse(1534236469));
    }
    
}
