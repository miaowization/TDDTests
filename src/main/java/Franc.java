public class Franc extends Money{
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public Franc(int amount){
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
