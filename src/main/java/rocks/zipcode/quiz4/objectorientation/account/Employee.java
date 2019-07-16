package rocks.zipcode.quiz4.objectorientation.account;

import java.sql.Wrapper;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {
    private BankAccount bankAccount;
    private Double hoursWorked = 0.0;
    private Double hourlyWage;

    public Employee() {
    }

    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Employee(BankAccount bankAccount, Double hourlyWage ) {
        this.bankAccount = bankAccount;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked += numberOfHours;

    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return hourlyWage * hoursWorked;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);

    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }
}
