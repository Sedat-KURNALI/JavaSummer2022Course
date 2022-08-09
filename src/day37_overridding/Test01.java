package day37_overridding;

class ParentClass {
    public int getDetails(String temp) {
        System.out.println("Derived class" + temp);
        return 0;
    }
}
public class Test01 extends ParentClass {
    public int getDetails(String temp) {
        System.out.println("Test class " + temp);
        return 0;
    }
    public static void main(String[] args) {
        Test01 obj = new Test01();
        obj.getDetails("GFG") ;
    }

}
