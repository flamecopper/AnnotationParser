import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Folder {
	private String evaluation;
	private int year;
	private String task;
	private String type;
	public ArrayList<TaskFiles> files = new ArrayList<TaskFiles>();
        public Folder(){   
        }
        public Folder(String folderName){
            //split the token as a folder for tokenizing
            StringTokenizer st = new StringTokenizer(folderName,"_");
            this.evaluation = st.hasMoreTokens() ? st.nextToken() : null;
            this.year = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;
            this.task = st.hasMoreTokens() ? st.nextToken() : null;
            this.type = st.hasMoreTokens() ? st.nextToken() : null;
            readFolder(folderName);
        }
        public void readFolder(String folderName){
            File myDirectory = new File(folderName);//using
            TaskFiles file;
            if(myDirectory.isDirectory()){
                //to read only the text files in the documents
                FilenameFilter filter = new OnlyExt("txt");
                String s[] = myDirectory.list(filter);
                System.out.println("Total File Read = " + s.length);
                //added comment to exclude substring of filename
                for (int i=0; i < s.length; i++) { 
                    String fileName = s[i];
                    int pos = fileName.lastIndexOf(".");
                    if (pos > 0) {
                        fileName = fileName.substring(0, pos);
                }
              
                file = new TaskFiles(fileName);
                files.add(file);//add files to the end of the arraylist
                } 
            }
       }
}

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = ("." + ext).toLowerCase();
    }

    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(ext);
    }
}