public class Money {
    protected int amount;

    protected Money(int amount){
        this.amount = amount;
    }

    public Money() {
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier);
    }
}
