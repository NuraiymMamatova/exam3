public interface BankAccountImpl {
     void  deposit(double sum);
     void withDraw(int sum)throws LimitException;

}
