import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("=====Hesap Makinesi=====");
        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen işlem yapmak istediğiniz ilk sayıyı giriniz.");
        int number1= sc.nextInt();
        System.out.println("Lütfen işlem yapmak istediğiniz ilk sayıyı giriniz.");
        int number2= sc.nextInt();
        System.out.println("Lütfen işlem yapmak operatör için atanmış sayıyı giriniz.");
        System.out.println("1====> +");
        System.out.println("2====> -");
        System.out.println("3====> *");
        System.out.println("4====> /");
        int operatorSelection= sc.nextInt();

        FourOperations fourOperations= new FourOperations();

        if(operatorSelection==1){
            //plus
            int equalsto= fourOperations.plus(number1,number2);
            systemMessage(equalsto);

        } else if (operatorSelection==2) {
            //minus
            int equalsto= fourOperations.minus(number1,number2);
            systemMessage(equalsto);

        } else if (operatorSelection==3) {
            //multiply
            int equalsto= fourOperations.multiply(number1,number2);
            systemMessage(equalsto);

        }else {
            //divide
            int equalsto= fourOperations.divide(number1,number2);
            systemMessage(equalsto);
        }


    }
    public static void systemMessage(int message){
        System.out.println(message);
    }

}
