public class WaitnNotify {
    int balance = 1000;

    public synchronized void withdraw(int money) {
        while (balance < money) {
            try {
                wait();
            } catch (Exception e) {
            }
            balance -= money;
        }
    }// withdraw synchronized

    public synchronized void deposit(int money) {
        balance += money;
        notify();
    }
}
