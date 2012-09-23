public class Entity extends Annotation {
	private int start_offset;
	private int end_offset;
	private String term;

    Entity(String annotation_id,String type, int setStart_offset, int setEnd_offset, String term) {
        super(annotation_id,type);
        this.start_offset = setStart_offset;
        this.end_offset = setEnd_offset;
        this.term = term;
    }
    /**
     * @return the start_offset
     */
    public int getStart_offset() {
        return start_offset;
    }

    /**
     * @param start_offset the start_offset to set
     */
    public void setStart_offset(int start_offset) {
        this.start_offset = start_offset;
    }

    /**
     * @return the end_offset
     */
    public int getEnd_offset() {
        return end_offset;
    }

    /**
     * @param end_offset the end_offset to set
     */
    public void setEnd_offset(int end_offset) {
        this.end_offset = end_offset;
    }

    /**
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }
    @Override
    public String toString() {
        return  super.toString() + "Entity{" + "start_offset=" + start_offset + ", end_offset=" + end_offset + ", term=" + term + '}';
                
    }
  
    
}