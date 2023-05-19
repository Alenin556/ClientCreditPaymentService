public class CreditPaymentService {

    public double creditMonthPayment(int amount, double percent, int months) {

        double monthPercent = percent / 100 / 12; // месячная ставка

        double a = 1 + monthPercent;
        double b = Math.pow(a, months);

        double pay1 = amount * ( monthPercent + (monthPercent/(b - 1)));
        return pay1;
    }
}
