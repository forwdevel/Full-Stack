public class Synchronized {
    int balance;

    // 1. 메소드 전체를 임계 영역으로 지정
    // public synchronized void calcSum() {
    // ...
    // }
    public synchronized void methodSet(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            balance -= money;
        }
    }

    // 2. 특정한 영역을 임계 영역으로 지정
    // synchronized(객체의 참조변수) {
    // ...
    // }
    public void SpeSet(int money) {
        synchronized (this) {
            if (balance >= money) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                balance -= money;
            }
        }
    }
}
