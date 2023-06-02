public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //here the key to solving the problem is to find a slot whose previous is 0 and whose next is also 0
        //If we find that slot then we can place the flowers in that slot
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                //This takes care of the 0th index also
                //0th index slot will not have any previous
                //We can assume the previous of first is 0
                int prev = (i == 0 || flowerbed[i - 1] == 0 ? 0 :1);
                //The last index will not have any next slot
                //We can assume the next of last is 0
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0 ? 0:1);
                //Once we find a slot whose prev and next are both zero
                if(prev == 0 && next == 0){
                    //increment the counter by 1
                    count++;
                    //make the current slot equal to 1
                    flowerbed[i] = 1;
                }
                //compare count with n
                if(count >= n){
                    return true;
                }
            }
        }
        //return false if we can't place the required no of flowers
        return false;
        
    }

    public static void main(String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        System.out.println("Testing the first test case");
        int[] flowerbed1 = {1,0,0,0,1};
        int n1 = 1;
        System.out.println("Can "+n1+" new flowers be planted in the flowerbed "+" without violating the condition is: "+cpf.canPlaceFlowers(flowerbed1, n1));
        System.out.println("Testing the second test case");
        int[] flowerbed2 = {1,0,0,0,1};
        int n2 = 2;
        System.out.println("Can "+n2+" new flowers be planted in the flowerbed "+" without violating the condition is: "+cpf.canPlaceFlowers(flowerbed2, n2));
    }
    
}
