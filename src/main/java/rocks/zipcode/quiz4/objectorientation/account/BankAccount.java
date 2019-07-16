package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable  {
    private Double balance = 0.0;

    public void setBalance(Double val) {
        this.balance= val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        if (amountToIncreaseBy >= 0) {
            setBalance(balance + amountToIncreaseBy);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy > this.balance || amountToDecreaseBy < 0){
            throw new IllegalArgumentException();
        }
        setBalance( balance - amountToDecreaseBy);

    }

    @Override
    public Double getBalance() {
        return this.balance;
    }
}
