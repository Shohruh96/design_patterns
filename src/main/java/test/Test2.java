package test;

public class Test2{
    public static void main(String[] args) {
        System.out.println("hello");
        Hippo hippo = new Hippo();
    }
}

class Animal{
    Animal(){
        System.out.println("A");
    }
}
class Hippo extends Animal{
    Hippo(){
        System.out.println("H");
    }
}
