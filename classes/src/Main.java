public class Main {
    public static void main(String[] args) {
        //Classes reference type
            CustomerManager customerManager = new CustomerManager();
            CustomerManager customerManager2= new CustomerManager();
            customerManager= customerManager2;
            customerManager.Add();
            customerManager.Remove();
            customerManager.Remove();

            //value type
            int number1 = 10;
            int number2=20;
            number2=number1;
            number1=30;
        System.out.println(number2);

        int[] sayilar1= new int[] {1,2,3};
        int[] sayilar2 = new int[]{1,2,3};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }

}
