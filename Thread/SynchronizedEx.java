public class SynchronizedEx {
    public static void main(String[] args) {
        Runnable r = new RunnableEx();

        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    // Should to set private
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= money;
        }
    }// withdraw
}

class RunnableEx implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:" + acc.getBalance());
        }
    }// run()

}