import java.util.ArrayList;

public class GenerateIp {
   public ArrayList<String> genIp(String s) {
   ArrayList<String> ans = new ArrayList<>();
        // code here
        //if the string length is less than 4 or greater than 12 then no valid ip can be generated
        if(s.length() < 4 || s.length() > 12){
          ans.add("-1");
          return ans;
        }
        //start forming the ip addresses by placing the dots
         for(int firstDot = 0; firstDot < s.length() -3; firstDot++){
          for(int secondDot = firstDot + 1; secondDot < s.length() -2; secondDot++){
            for(int thirdDot = secondDot + 1; thirdDot < s.length() -1; thirdDot++){
              //check if the ip address can be formed by placing the firstdot, seconddot and thirddot
              if(isValid(s, firstDot, secondDot, thirdDot)){
                //generate the ip address
                String validIp = generate(s, firstDot, secondDot, thirdDot);
                //add the ip address to the list
                ans.add(validIp);
              }
            }
          }
        }
        //if there are no valid ip addresses then return -1
        if(ans.size() == 0){
          ans.add("-1");
          return ans;
        }

        return ans;

        
       
    }
    //function to check if the ip address is valid
    public boolean isValid(String s, int firstDot, int secondDot, int thirdDot){
     //get the first part of the ip address before the dot and check if it is valid
     String first = s.substring(0, firstDot + 1);
      if(first.charAt(0) == '0' && first.length() > 1){
        return false;
      }
      if(Integer.parseInt(first) > 255 || Integer.parseInt(first) < 0 ){
        return false;
      }
      //get the Second part of the ip address before the dot and check if it is valid
      String second = s.substring(firstDot + 1, secondDot + 1);
       if(second.charAt(0) == '0' && second.length() > 1){
        return false;
      }
      if(Integer.parseInt(second) > 255 || Integer.parseInt(second) < 0 ){
        return false;
      }
      ////get the third part of the ip address before the dot and check if it is valid
       String third = s.substring(secondDot + 1, thirdDot + 1);
       if(third.charAt(0) == '0' && third.length() > 1){
        return false;
      }
      if(Integer.parseInt(third) > 255 || Integer.parseInt(third) < 0 ){
        return false;
      }
      ////get the last part of the ip address after the dot and check if it is valid
       String fourth = s.substring(thirdDot + 1);
       if(fourth.charAt(0) == '0' && fourth.length() > 1){
        return false;
      }
      if(Integer.parseInt(fourth) > 255 || Integer.parseInt(fourth) < 0 ){
        return false;
      }
      return true;
    }
    //helper function to generate the ip address
    public String generate(String s, int firstDot, int secondDot, int thirdDot){
      String first = "";
      String second = "";
      String third = "";
      String fourth = "";
      for(int i = 0; i <= firstDot; i++){
        first = first + s.charAt(i);
      }
      for(int i = firstDot + 1; i <= secondDot; i++){
        second = second + s.charAt(i);
      }
      for(int i = secondDot + 1; i <= thirdDot; i++){
        third = third + s.charAt(i);
      }
      for(int i = thirdDot + 1; i < s.length(); i++){
        fourth = fourth + s.charAt(i);
      }

      return first + "." + second +"." + third +"." + fourth;
    }

    public static void main(String[] args) {
      GenerateIp gip = new GenerateIp();
      System.out.println("Testing out the first test case");
      String s1 = "11211";
      
      ArrayList<String> ans1 = gip.genIp(s1);
      for(String ip: ans1){
        System.out.println(ip);
      }
      System.out.println();
      System.out.println("Testing out the Second test case");
      String s2 = "55";
      
      ArrayList<String> ans2 = gip.genIp(s2);
      for(String ip: ans2){
        System.out.println(ip);
      }

    }
}
