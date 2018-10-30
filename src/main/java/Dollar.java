public class Dollar extends Money{


    public Dollar(int amount){
        this.amount = amount;
    }


    @Override
    public int hashCode() {
        return amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }


}
