class polymorphism {
    public int add(int a , int b){
        return a+b;
    }
    public int add (int a , int b , int c){
        return a+b+c;
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Main{
    public static void main(String[] args){
        polymorphism p = new polymorphism();
        System.out.println(p.add(2,4));
        System.out.println(p.add(2,4,6));
        
        
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
        
        
    }
}
