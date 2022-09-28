public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
        ogretmenKrediManager.Calculate();
        KrediUI krediUI= new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());

    }
}
