import java.util.Scanner;

public class ClientCreditPaymentService {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        System.out.println("Если вы хотите рассчитать свой ежемесячный платеж по кредиту вам необходимо ввести следующие данные:");
        System.out.println(" ");
        System.out.println("Сумму кредита: ");
        int a = sc.nextInt();
        System.out.println("Годовую процентную ставку: ");
        int b = sc.nextInt();
        System.out.println("Период в месяцах, на который вы взяли кредит: ");
        int c = sc.nextInt();

        System.out.println("Ежемесячный платеж в вашем случае составит: ");
        int clientPayment = (int) creditPaymentService.creditMonthPayment(a, b, c);
        System.out.println(clientPayment);
        System.out.println(" ");


    }

}
