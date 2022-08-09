package day37_overridding;

class Test {
    int data = 100;
    Test demoMethod() {
        return this;
    }
}

public class Sample extends Test {
    int data = 1000;

    public static void main(String args[]) {
        Sample sam = new Sample();
        System.out.println(sam.demoMethod().data);
    }

    Sample demoMethod() {
        return this;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}