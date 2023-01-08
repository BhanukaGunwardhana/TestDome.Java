package Java_Advanced.TestDomeTests;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        try {
            List<String>list=new ArrayList<>();
            String str="<folder\\sname=\"([.]+)\"\\s[/]*>";
           // String str="<folder name=\"users\" />";
            Pattern pt=Pattern.compile(str);
            Matcher mt=pt.matcher(xml);
            while(mt.find()){
                String s= mt.group(1);
                System.out.println(s);
                if(s.charAt(0)==startingLetter){
                    list.add(s);
                } 
                else{
                    continue;
                }
            }
            return list;

            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
    	  
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}