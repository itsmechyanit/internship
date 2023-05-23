public class IsAdditiveSequence {
    public boolean isAdditiveNumber(String num){
        //n represents the length of the string
        int n = num.length();
        //112358
        //i will be used to create the first substring that is n1
        for(int i = 1; i < n - 1; i++){
            long n1 = Long.parseLong(num.substring(0, i));
            //This is used to check if the n1 substring starts with zero
            if(!String.valueOf(n1).equals(num.substring(0, i))){
                break;
            }
            //j will be used to create the second substring that is n2
            for(int j = i + 1; j < n; j++){
                //This is used to check if the n2 substring starts with zero
                long n2 = Long.parseLong(num.substring(i, j));
                if(!String.valueOf(n2).equals(num.substring(i, j))){
                    break;
                }
                //once n1 and n2 are fixed we will pass that to the recursive function to check if the string is additive with the given n1 and n2
                boolean found = findRec(n1, n2, num.substring(j), false);
                if(found){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean findRec(Long n1, long n2, String s, boolean found){
        //base case
        if(s.length() == 0 && found){
            return true;
        }
        //Here s represents the remaining substring after n1 and n2 are fixed
        String n3 = String.valueOf(n1 + n2);
        int idx = Math.min(s.length(), n3.length());
        //if the remaining substring starts with the sum of n1 and n2
        //then n1 becomes n2 and n2 becomes n3
        if(s.substring(0, idx).equals(n3)){
            return findRec(n2, Long.parseLong(n3), s.substring(idx), true);
        }

        return false;
    }

    public static void main(String[] args) {
        IsAdditiveSequence ias = new IsAdditiveSequence();
        System.out.println("Testing out the first test case");
        String s1 = "112358";
        System.out.println("Is the String "+s1+" a valid additive sequence: "+ias.isAdditiveNumber(s1));

        System.out.println("Testing out the Second test case");
        String s2 = "199100199";
        System.out.println("Is the String "+s2+" a valid additive sequence: "+ias.isAdditiveNumber(s2));

        System.out.println("Testing out the Second test case");
        String s3 = "12345678";
        System.out.println("Is the String "+s3+" a valid additive sequence: "+ias.isAdditiveNumber(s3));

    }
}
