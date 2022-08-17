public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	                                     				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
	public void addItem(T item) {
		if (currentItem >=this.size())
		{
			System.out.println("list full, unable to add item ");
			return;
		}
		arList[currentItem] = item;
		currentItem++;		
	}//end addItem
	public int size()
	{
		return arList.length;
	}
	public T getItem(int i) {
		if (i>=this.size()) {
			System.out.println("Size parameter suggested does not meet size requirement:" +this.size());
			return null;
		}
		return arList[i];
	}//end getItem
	
}//end class
