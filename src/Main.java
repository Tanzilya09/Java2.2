public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(20000);

        boolean isInfinite=true;
        while (isInfinite){
            System.out.println("У вас: "+bankAccount.getAmount());
            try{
                bankAccount.withDraw(6000);
            } catch(LimitException e){
                try {
                    bankAccount.withDraw(e.getRemainingAmount());
                    break;
                }catch (LimitException e1){

                }
            }

        }
        System.out.println("У вас: "+bankAccount.getAmount());

    }
}
