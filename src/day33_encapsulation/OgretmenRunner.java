package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogrt1 = new Ogretmen();
        ogrt1.setIsim("Tulay");
        System.out.println(ogrt1.getIsim());
        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */
        ogrt1.setSoyisim("Palta");
        System.out.println(ogrt1.getSoyisim());
    }
}
