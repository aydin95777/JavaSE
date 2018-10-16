package javase07.t01;

public class NotEnoughMoneyExcep extends RuntimeException {
    public NotEnoughMoneyExcep() {
        System.out.println("Not enough money!");
    }
}