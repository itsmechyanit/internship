import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFile {
    public List<List<String>> findDuplicate(String[] paths) {
        //We will use a hashmap to store the content against the complete file path
        HashMap<String, List<String>>hm = new HashMap<>();
        for(String path:paths){
            //parse the path
            String[]dir = path.split(" ");
            //store the root directory of the file
            String rootDirectory = dir[0];
            for(int file = 1; file < dir.length; file++){
                //extract the content of the file
                int left = dir[file].indexOf("(");
                int right = dir[file].indexOf(")");
                //content variable stores the content of the file
                String content = dir[file].substring(left + 1, right);
                //extract the file name
                String fileName = dir[file].substring(0, left);
                //if the content already exists it means we have found a duplicate 
                if(hm.containsKey(content)){
                    hm.get(content).add(rootDirectory +"/" + fileName);
                }

                else{
                    //if the content does not exists then add the complete path to the hasmap
                   ArrayList<String> fp = new ArrayList<>();
                   fp.add(rootDirectory +"/" + fileName);
                   hm.put(content, fp);
                }

            }

            
        }
        //final ans stores the list of file with duplicate content
        List<List<String>> finalAns = new ArrayList<>();
        //iterate over the hashmap and find out if the content/key has more than one file paths
        for(Map.Entry<String,List<String>> e: hm.entrySet()){
            if(e.getValue().size() > 1){
                //add the path to the final answer
                finalAns.add(e.getValue());
            }
        }
        //return the answer
        return finalAns;
    }

    public static void main(String[] args) {
        
        FindDuplicateFile fdf = new FindDuplicateFile();
        System.out.println("Testing the first Test case");
        String[] paths1 = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};

        List<List<String>> ans1 = fdf.findDuplicate(paths1);
        System.out.println("duplicate files in the file system in terms of their paths are");
        //This is simply done to print the answer exactly as displayed on Leetcode
        System.out.print("[");
        int k1 = 0;
        for(List<String> dup: ans1){
            if(k1 == dup.size() -1){
                System.out.print(dup);
                break;
            }
            System.out.print(dup);
            System.out.print(", ");
            k1++;
        }
        System.out.print("]");
        System.out.println();

        System.out.println("Testing the second Test case");
        String[] paths2 = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};

        List<List<String>> ans2 = fdf.findDuplicate(paths2);
        System.out.println("duplicate files in the file system in terms of their paths are");
        System.out.print("[");
        int k2 = 0;
        for(List<String> dup: ans2){
            if(k2 == dup.size() -1){
                System.out.print(dup);
                break;
            }
            System.out.print(dup);
            System.out.print(", ");
            k2++;
        }
        System.out.print("]");

    }
}
