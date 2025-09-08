import java.util.HashMap;
import java.util.Map;

public class AtmOpImp implements AtmOperations {
    BankAccount bank=new BankAccount();
    HashMap<Double,String> ministmt=new HashMap<>();
    @Override
    public void viewbalance() {
        System.out.println("Available balance is :" +bank.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if(amount< bank.getBalance()) {
            ministmt.put(amount,": Amount withdrawn");
            System.out.println("Collect the cash :" + amount);
            bank.setBalance(bank.getBalance() - amount);
        }else{
            System.out.println("Low Balance");
        }
        viewbalance();
    }

    @Override
    public void deposit(double amount) {
        ministmt.put(amount,": Amount Deposited");
        System.out.println(amount+": Deposited successfully");
        bank.setBalance(bank.getBalance()+amount);
        viewbalance();
    }

    @Override
    public void viewStatement() {
        for(Map.Entry<Double,String>m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
