public class CustomerManager {
    public void Add(){
        // müşteri ekleme komutları-- gruplandırdık-- methodlar
        systemMessage("Yeni üye eklendi");
    }
    public void Remove(){
        systemMessage("Üye bilgileri silindi.");
    }
    public void Update(){
        systemMessage("Üye bilgileri güncellendi.");
    }
    public void systemMessage(String message){
        System.out.println(message);
    }

}
