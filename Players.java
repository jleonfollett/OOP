
public class Players {
	private int height;
	private String first;
	private String last;
	 
    public Players(int startHeight, String startFirst, String startLast) {
        height = startHeight;
        first = startFirst;
        last = startLast;
    }
        
    
    public void setHeight(int newValue) {
        height = newValue;
    }
        
    public void setFirst(String newValue) {
        first = newValue;
    }
        
    public void setLast(String newValue) {
        last = newValue;
    }
    
    public int getHeight() {
        return height;
    }
        
    public String getFirst() {
        return first;
    }
        
    public String getLast() {
        return last;
    }
        
   }
