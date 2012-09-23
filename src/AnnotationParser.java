import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * @author alvin567
 */
public class AnnotationParser {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Folder folder = new Folder("BioNLP-ST_2011_genia_test_data");//read all files from a list
        //store all annotations in a hashmap
        String fname[] = {"PMID-9619918.a1","PMID-9619918.a2"};
        Annotations anns = readFile(fname);
        PrintWriter r = new PrintWriter("recievedFile.txt");
        Iterator it = anns.getAnn().entrySet().iterator(); 
        while (it.hasNext()) { 
        Map.Entry pairs = (Map.Entry)it.next(); 
        r.println(pairs.getKey() + " = " + pairs.getValue()); 
        it.remove();
        }
        r.flush();
    }
    public static Annotations readFile(String [] readFile) throws FileNotFoundException{
        Annotations anns = new Annotations();
        HashMap hp = new HashMap();
        for(int a = 0; a < readFile.length;a++){
        FileReader file = new FileReader(readFile[a]);
        Scanner sc = new Scanner(file);//read files
        String lineOfData;
        while(sc.hasNextLine()){
            lineOfData = sc.nextLine();
            Annotation annotation = null;
            StringTokenizer token = new StringTokenizer(lineOfData,"\t");
            String annotationID = token.nextToken();            
            //rest of annotation
            StringTokenizer rest_of = new StringTokenizer(token.nextToken());
            if(annotationID.startsWith("T")){//entity annotations
                String type = rest_of.nextToken();
                int  setStart_offset =  Integer.parseInt(rest_of.nextToken());
                int  setEnd_offset =  Integer.parseInt(rest_of.nextToken());
                String term = token.nextToken();
                annotation = new Entity(annotationID,type,setStart_offset,setEnd_offset,term);
            }
            if(annotationID.startsWith("M")){//modification
                String type = rest_of.nextToken();
                String eventID = rest_of.nextToken();
                annotation = new Modification(annotationID,type,eventID);
            }
            if(annotationID.startsWith("E")){
                String [] textbound = rest_of.nextToken().split(":");
                String type = textbound[0];
                String trigger = textbound[1];
                int tokenSize = rest_of.countTokens();
                HashMap <String,Annotation> arguements = new HashMap();
                //Represented in standoff as ID\tTYPE:TRIGGER [ROLE1:PART1 ROLE2:PART2 ...]
                for(int x = 0;x < tokenSize;x++){ 
                    String roleID = rest_of.nextToken();
                    String [] arguement = roleID.split(":");
                    String roles = arguement[0];
                    String part = arguement[1];
                    Annotation parts = (Annotation) hp.get(part);
                    arguements.put(roles,parts);
                }
                annotation = new Event(annotationID,type,trigger,arguements);
            }
            if(annotationID.startsWith("*")){//equivalence relationshi
                String type = rest_of.nextToken();//ignore token
                String annID1 = rest_of.nextToken();
                String annID2 = rest_of.nextToken();
                annotation = new Equivalence(annotationID,type,annID1,annID2);
            }
            if(annotationID.startsWith("R")){
                String type = rest_of.nextToken();
                String [] splitTerm = rest_of.nextToken().split(":");
                annotation = new Relation(annotationID,type,splitTerm[0],splitTerm[1]);
            }
            hp.put(annotationID, annotation);  
        }
        }
        anns.setAnn(hp);
        return anns;
    } 
}
