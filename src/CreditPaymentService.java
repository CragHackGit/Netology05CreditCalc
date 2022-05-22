public class CreditPaymentService {
    public double calculate(double creditAmount, double percent, double month) {

        double stavka = percent / 12 / 100;
        double a1 = stavka + 1;
        double pow1 = Math.pow(a1, month);
        double anuiet = (stavka * pow1) / (pow1 - 1);
        double calculate = anuiet * creditAmount;
        // int calculate = (int) Math.round(monthlyPayment);
        return calculate;

    }
}
