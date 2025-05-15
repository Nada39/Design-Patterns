package Factorymethod;

public class Payment {
    public int CustomerId;
    public double ChargedAmount;

    Payment(int CustomerId , double ChargedAmount)
    {
        this.CustomerId = CustomerId;
        this.ChargedAmount = ChargedAmount;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public void setChargedAmount(double chargedAmount) {
        ChargedAmount = chargedAmount;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public double getChargedAmount() {
        return ChargedAmount;
    }

}
