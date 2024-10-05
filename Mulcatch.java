import java.util.ArrayList;

public class Mulcatch {
    public static void main(String[] args) {
     try {
        int arr[]=new int[5];
        arr[5]=10/0;   
     } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println("ArithmeticException division by zero");
     } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException array out of range");

     } catch(Exception e){
        System.out.println("Other sum Exception");
     }
    finally{
        System.out.println("Rest of the code");
    }
}
}