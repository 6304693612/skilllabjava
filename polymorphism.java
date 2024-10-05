class poly {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a + b + c;
    }
    public double add(double a,double b){
        return a + b;
    }
}
public class polymorphism{
    public static void main(String[] args) {
        poly p=new poly();
        System.out.println("sum of the integers : " + p.add(10,20));
        System.out.println("sum of the integers : " + p.add(10,20,30));
        System.out.println("sum of the integers : " + p.add(10.5,20.5));
    }
}
