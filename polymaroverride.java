class animal{
    public void sound(){
        System.out.println("Animal can make sound");
    }
}
class dog extends animal{
    public void sound(){
        System.out.println("Dog can Bark");
    }

}
class cat extends animal{
    public void sound(){
        System.out.println("cat can move");
    }

}
public class polymaroverride{
public static void main(String[] args) {
    dog d =new dog();
    d.sound();
    cat c =new cat();
    c.sound();
}
}