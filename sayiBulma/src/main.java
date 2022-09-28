import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 6, 7, 3, 9, 8, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen aramak istediğiniz rakamı aşağıya tuşlayınız.");
        int aranacak = sc.nextInt();
        boolean varMi = false;


        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayı mevcut");
        } else {
            System.out.println("Sayı mevcut değil");
        }

    }
