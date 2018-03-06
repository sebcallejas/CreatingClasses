/*
* Sebastian Callejas
* Period 2
* Project: BankAccount
*/

package BankAccount;

/**
 *
 * @author 18051
 */
public class BankAccount {
//Lets get it done
    private double balance;
    private String username;
    private String password;
    
    public BankAccount(double bal, String user, String pass){
        balance = bal;
        username = user;
        password = pass;
    }
    
    public double getBalance(){
        return balance;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setBalance(double pBalance){
        balance = pBalance;
    }
    public void setUsername(String pUsername){
        username = pUsername;
    }
    public void setPassword(String pPassword){
        password = pPassword;
    }
    public String toString(){
        return "Account balance is "+balance+". Username is "+username+
                ". Password is "+password+".";
    }
}
