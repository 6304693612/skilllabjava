class person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.isEmpty()) {
            System.out.println("Invalid name");
        } else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Invalid age");
    }
}

public class encapsule {
    public static void main(String[] args) {
        person per = new person();
        per.setName("");
        per.setAge(20);
        System.out.println();
        System.out.println("Name:" + per.getName());
        System.out.println("Name:" + per.getAge());
    }
}
    
    