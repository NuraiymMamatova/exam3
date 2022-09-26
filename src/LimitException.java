public class LimitException extends Exception{
    private String message;
    private double remainingAmount;
    public LimitException(String message, double remainingAmount){
        this.message = message;
        this.remainingAmount = remainingAmount;
    }
    public LimitException(){

    }



    public void setMessage(String message) {
        this.message = message;
    }

    public void getRemainingAmount(){
        System.out.println(message+remainingAmount);
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
