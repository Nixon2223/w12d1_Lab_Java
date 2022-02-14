public class CreditCard extends Card{

    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }
    public String scan() {
        return "Payment Successful";
    }

    public String pay() {
        return "Pay with credit card";
    }
}
