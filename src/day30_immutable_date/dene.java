package day30_immutable_date;

public class dene {
    //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
    // input : "m", "e", "r", "v", "e";
    // output : merve
    public static void main(String[] args) {
        String[] arr = {"m", "e", "r", "v", "e"};
        String isim = "";
        for (String w : arr) {
            isim += w;
        }
        System.out.println("isim = " + isim);
    }
}
/*
        for(int i=0;i<arr.lenght;i++){
            isim+=arr[i];
        }

 */