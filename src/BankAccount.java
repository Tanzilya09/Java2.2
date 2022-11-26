public class BankAccount {
    private double amount;
    public double getAmount() {
        return amount;
    }

    public  void deposit(double sum) {
        amount+=sum;

    }

    public void withDraw(double sum) throws LimitException {
        if(sum>amount){
            throw new LimitException("У вас недостаточно денег!",amount);
        }
        amount-=sum;
    }
}
