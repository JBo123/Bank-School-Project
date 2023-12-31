package org.delta.bank.account;

import jakarta.inject.Inject;
import org.delta.bank.person.Owner;
import print.LogService;

public class AccountFactory {
   @Inject private AccountNumberGeneratorService accountNumberGeneratorService;



    public BaseBankAccount createBaseBankAccount(Owner owner,
                                                 Double balnce){

        String bankAccountNumber = this.accountNumberGeneratorService.generateAccountNumber();
        return new BaseBankAccount(
                owner,
                bankAccountNumber,
                balnce);
    }

    public SavingBankAccount createSavingBankAccount(Owner owner,
                                                     Double balnce){

        String bankAccountNumber = this.accountNumberGeneratorService.generateAccountNumber();


        return new SavingBankAccount(
                owner,
                bankAccountNumber,
                balnce);
    }

    public StudentBankAccount createStudentBankAccount(Owner owner,
                                                       Double balnce){

        String bankAccountNumber = this.accountNumberGeneratorService.generateAccountNumber();


        return new StudentBankAccount(
                owner,
                bankAccountNumber,
                balnce);
    }
}
