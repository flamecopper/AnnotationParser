import java.util.ArrayList;
import java.util.StringTokenizer;

public class TaskFiles {
	private String ID_System;
	private String ID_Number;
	private String section_Title;
	private String section_Number;
	private String subsection_Number;
        
    TaskFiles(String fileName){
        StringTokenizer st = new StringTokenizer(fileName,"-");          
        String id_system = st.hasMoreTokens() ? st.nextToken() : null;
        String id_number = st.hasMoreTokens() ? st.nextToken() : null;
        String section_Title = st.hasMoreTokens() ? st.nextToken() : null;
        String section_Number  = st.hasMoreTokens() ? st.nextToken() : null;
        String subsection_Number = st.hasMoreTokens() ? st.nextToken() : null;
        //this(id_system, id_number, section_Title, subsection_Number, subsection_Number);
        this.ID_Number = id_system;
        this.ID_System = id_number;
        this.section_Title = section_Title;
        this.section_Number  = section_Number;
        this.subsection_Number = subsection_Number;
       
    }
    TaskFiles(String id_system, String id_number, String section_Title, String section_Number, String subsection_Number) {
        this.ID_Number = id_number;
        this.ID_System = id_system;
        this.section_Title = section_Title;
        this.section_Number = section_Number;
        this.subsection_Number = subsection_Number;
    }
        
  
     /**
     * @return the ID_System
     */
    public String getID_System() {
        return ID_System;
    }

    /**
     * @param ID_System the ID_System to set
     */
    public void setID_System(String ID_System) {
        this.ID_System = ID_System;
    }

    /**
     * @return the ID_Number
     */
    public String getID_Number() {
        return ID_Number;
    }

    /**
     * @param ID_Number the ID_Number to set
     */
    public void setID_Number(String ID_Number) {
        this.ID_Number = ID_Number;
    }

    /**
     * @return the section_Title
     */
    public String getSection_Title() {
        return section_Title;
    }

    /**
     * @param section_Title the section_Title to set
     */
    public void setSection_Title(String section_Title) {
        this.section_Title = section_Title;
    }

    /**
     * @return the section_Number
     */
    public String getSection_Number() {
        return section_Number;
    }

    /**
     * @param section_Number the section_Number to set
     */
    public void setSection_Number(String section_Number) {
        this.section_Number = section_Number;
    }

    /**
     * @return the subsection_Number
     */
    public String getSubsection_Number() {
        return subsection_Number;
    }

    /**
     * @param subsection_Number the subsection_Number to set
     */
    public void setSubsection_Number(String subsection_Number) {
        this.subsection_Number = subsection_Number;
    }

    /**
     * @return the annotations
     */
    public void readAnnotation(){
        
    }
    
    @Override
    public String toString() {
        return "TaskFiles{" + "ID_System=" + ID_System + ", ID_Number=" + ID_Number + ", section_Title=" + section_Title + ", section_Number=" + section_Number + ", subsection_Number=" + subsection_Number + '}';
    }

   
}