public class MultipleCatchBlockExample {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[5] = / 0;
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException divisible by zero");
            catch(ArithmeticIndexOutBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException :array index out of bound");
            }catch(Exception e){
                System.out.println("Exceptions: some other exception occured");
            }
            System.out.println("rest of the code");
        }
    }

    