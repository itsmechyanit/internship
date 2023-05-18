import java.io.*;
import java.util.regex.*;
public class ValidPhoneNumbers {

    public void displayValidNumbers() throws FileNotFoundException, IOException{
        //create a FileReader object to read from a file
        FileReader fr = new FileReader("Phonenumbers.txt");
        //We will use buffer reader to store the content in a buffer for optimizing file reading
        BufferedReader br = new BufferedReader(fr);
        String phone="";
        System.out.println("Here are the valid phone numbers in the file");
        //read each line from a file
        while ((phone = br.readLine()) != null){
            //check if the phone number is valid
            if(isValid(phone)){
                System.out.println(phone);
            }
        }
        br.close();
    }

    private boolean isValid(String phone){
        //p1 represents the first pattern (***) ***-*** here * represents a digit
        Pattern p1 = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
        //p2 represents the 2nd pattern ***-***-****
        Pattern p2 = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        
        Matcher m1 = p1.matcher(phone);
        
        Matcher m2 = p2.matcher(phone);
        //check if the phone number matches the first pattern
        if(m1.matches()){
            return true;
        }
        //check if the phone number matches the second pattern
        if(m2.matches()){
            return true;
        }
        //return false if nothing matches
        return false;

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ValidPhoneNumbers vpn = new ValidPhoneNumbers();
        vpn.displayValidNumbers();
    }
    
}
