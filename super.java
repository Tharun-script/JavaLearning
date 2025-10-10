class Parent{
    String v1 = "Parent";
    void show(){
        System.out.println("parent class method");
    }
    Parent(){
        System.out.println("parent class constructor");
    }
}
class Child extends Parent{
    String v1 = "Child";
    void show(){
        System.out.println("Child class method");
    }
    void display(){
        System.out.println(v1);
        System.out.println(super.v1);
        super.show();
        this.show();
    }
    Child(){
        super();
        System.out.println("child class constructor");
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
    }
}