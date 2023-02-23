package animal;

public class Animal {

    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
     void say(){
        System.out.println(name + "です。" + age + "歳です。");
    }
    
    
}
