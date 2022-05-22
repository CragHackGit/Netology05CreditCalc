public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment = service.calculate(1000000, 9.99, 12);
        int result = (int) Math.round(monthlyPayment);
        System.out.println("Ежемесячный платеж: " + result);
        double monthlyPayment2 = service.calculate(1000000, 9.99, 24);
        int result2 = (int) Math.round(monthlyPayment2);
        System.out.println("Ежемесячный платеж: " + result2);
        double monthlyPayment3 = service.calculate(1000000, 9.99, 36);
        int result3 = (int) Math.round(monthlyPayment3);
        System.out.println("Ежемесячный платеж: " + result3);
    }
}