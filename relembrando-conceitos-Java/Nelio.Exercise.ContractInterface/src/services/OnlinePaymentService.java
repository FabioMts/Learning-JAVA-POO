package services;

public interface OnlinePaymentService {

    double paymentFee(Double amount);
    double interest(double amount, int months);


}
