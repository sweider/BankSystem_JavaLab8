/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banksystem.lab4.core.account;

import banksystem.lab4.core.moneyamount.MoneyAmount;

/**
 *
 * @author alex
 */
public interface ITransactionAccess {
    
    public void deposite(MoneyAmount moneyToDeposite);
    
    public void withdraw(MoneyAmount moneyToWithdraw);
    
}
