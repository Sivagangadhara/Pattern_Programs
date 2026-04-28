package basic_Programs;

class person {
    int doing(){
        
         System.out.println("Try to do smtng");
                 return 20;

    }
}
class lady extends person{
    int doing(){
   
     System.out.println("hard working");
      return 30;
}
}

public class Basic_Programs extends lady {

	public static void main(String[] args) {
		 lady l = new lady();
	        l.doing();
	        
	        
	        System.out.println("awsome");
    
    
    
		
	}

}
