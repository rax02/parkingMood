package exception;

import service.PaymentService;

public class PaymentException extends Exception{
    public PaymentException(String message){
        super(message);
    }
}
