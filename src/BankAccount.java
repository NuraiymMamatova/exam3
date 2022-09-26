public class BankAccount implements BankAccountImpl {
    private  double amount;

    public double getAmount() {
        return amount;
    }

    @Override
    public void deposit(double sum) {
        if (sum<=60000){
            amount += sum;
            System.out.println("Вы успешно положили деньги!");
        }else {
            System.err.println("Вы можете положить на счет максимально 60000 сом.");
        }

    }

    @Override
    public void withDraw(int sum) throws LimitException {
      if (sum<amount && sum<=55000){
          System.out.println("Остаток денег на счете: "+(amount-=sum));

      }else {
          LimitException limitException = new LimitException("Запрашиваемая сумма на снятие больше чем остаток денег на счете: ", getAmount());
          try{
           throw new LimitException();
          }
          finally {
              limitException.getRemainingAmount();
          }
      }
    }
}
