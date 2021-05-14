public class Wallet implements IWallet{

    private double balance;

    Wallet(int balance) {
        this.balance = balance;
    }
    @Override
    public void addMoney(double money) {
        this.balance = money;
    }

    @Override
    public void removeMoney(double money) throws Exception {
        if(this.balance >= money) {
            this.balance = this.balance - money;
        }
    }
    @Override
    public double getBalance() {
        return this.balance;
    }

    public double DeductAmount(double amount) throws Exception {
        if (balance > amount)
        {
            return balance -= amount;
        }
        throw new Exception("Not Enough Amount available");
    }
}
