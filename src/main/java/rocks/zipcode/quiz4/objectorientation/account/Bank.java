package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void  removeBankAccountByIndex(Integer indexNumber) {
        int num  = indexNumber;
        bankAccounts.remove(num);

    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        if (bankAccounts.contains(bankAccount)){
            return true;
        } else return false;
//        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
