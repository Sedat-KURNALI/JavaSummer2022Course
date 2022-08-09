package day37_overridding;

public class A {
    A get() {
        System.out.println("A parent const");
        return this;
    }
}

class B1 extends A {
    public static void main(String args[]) {
        new B1().get().message();
    }

    B1 get() {
        System.out.println("B1 child const");
        return this;
    }

    void message() {
        System.out.println("mesaj daki yazı welcome to covariant return type");
    }
}
