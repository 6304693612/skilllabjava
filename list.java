import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");  
        fruits.add("Mango");      
                
        System.out.println("First fruit:"+fruits.get(0));  
        
        for(String fruit:fruits)
        System.out.println(fruit);
           
        fruits.remove("Mongo") ;
        System.out.println("After removing fruit:"+fruits);    


    }
    
}