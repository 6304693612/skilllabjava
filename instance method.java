package demo;

public class InstanceMethod {
   // public void Display(){
       // System.out.println("Name: " + name);
   // }
   public static int square(int number){
    return number * number;
   }
    public static void main(string[] args) {
       // InstanceMethod a = new InstanceMethod();
      //  a.Display("hi");
    int result = InstanceMethod.square(5);
    System.out.println("square of 5 is : " + result);
    }
}
