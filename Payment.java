package BookMyShowLLD;

import BookMyShowLLD.Enums.PaymentMode;

public class Payment {
    private int paymentId;
    private PaymentMode paymentMode;
    public int getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    
}
