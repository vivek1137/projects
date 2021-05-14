public interface IWallet {

    public void addMoney(double money);

    public void removeMoney(double money) throws Exception;
    public double getBalance() ;
}
