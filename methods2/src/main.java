public class main {
    public static void main(String[] args) {
        String mesaj ="Bu gün hava çok güzel.";
        String yeniMesaj = cityName();
        System.out.println(yeniMesaj);
        int number= topla(5,7);
        System.out.println(number);
        int toplam= topla2(2,3,3,5,4,6,5,4,84,5,6,5,4,6,1,6,1);
        System.out.println(toplam);
    }
    public static void add (){
        System.out.println("Eklendi");
    }

    public static void remove (){
        System.out.println("Silindi.");
    }

    public static void update(){

    }

    public static int topla (int n1,int n2){
        return n1+n2;
    }

    public static int topla2(int... numbers) {
        int toplam =0;
        for ( int number:numbers){
            toplam= toplam+number;
        }
        return toplam;
    }

    public static String cityName (){
         return "Ankara" ;
    }

}
