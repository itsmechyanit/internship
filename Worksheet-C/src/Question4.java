import java.io.BufferedReader;
import java.io.FileReader;

class ReadFromFile{
  //The object of this class will read data from a file
  //The file Path will be specified by the user
  
  //Fr will create a character stream
  //Basically Fr is a reader object that is required by the BufferedReader
  private FileReader fr;
  //Buffered Reader will use the character stream to read data
  private BufferedReader br;

  //constructor to initilize the bufferedreader and character stream
  ReadFromFile(String path){
    try{
      fr = new FileReader(path);
      br = new BufferedReader(fr);
    }
    catch(Exception e){
      System.out.println("The file does not exist");
    }
  }

  void read() throws Exception{
    int i;  
    // While we have not reached the EOF which is signified by -1 until then carry on reading the file  
    while((i=br.read())!=-1){
      //convert the ascii value to character  
      System.out.print((char)i);  
      } 
      //close the resources
      br.close();    
      fr.close(); 
  }

 

}





public class Question4 {
  public static void main(String[] args) {
    try{
      ReadFromFile rf = new ReadFromFile("./File.txt");
      rf.read();
    }catch(Exception e){
      System.out.println("Problem reading the file");
    }
  }
}
