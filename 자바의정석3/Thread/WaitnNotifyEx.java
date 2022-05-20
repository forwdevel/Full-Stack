import java.util.ArrayList;

class Table {
    // Set a array about 3 kinds of foods.
    String[] dishNames = { "donut", "donut", "burger" };
    // Set a max number of foods
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        // While table is full,
        while (dishes.size() >= MAX_FOOD) {
            // Get a current thread name (= person name)
            String name = Thread.currentThread().getName();
            // Print a Log
            System.out.println(name + " is waiting.");
            try {
                // If this object has a lock statement,
                // Lock Off and Wait.
                wait();
                // If this object has not a lock on statement,
                // Sleep this thread during 500ms.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // This is for Thread.sleep();
            }
        }
        // If dishes array has spare spaces,
        // Add new dish (ArrayList's mehtod)
        dishes.add(dish);
        // Thread in waiting statement is woke up.
        // Not this method, wake up object when slept in remove method(Table's).
        notify();
        System.out.println("Dishes: " + dishes.toString());
    }

    public void remove(String dishName) {
        synchronized (this) {
            // Get a current thread name (= person name)
            String name = Thread.currentThread().getName();

            // While table is empty,
            while (dishes.size() == 0) {
                // Print a log
                System.out.println(name + " is waiting.");
                try {
                    // If this object has a lock on statement,
                    // Lock off and Wait
                    wait();
                    // If this object has not a lock on statement,
                    // Sleep this thread during 500ms.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // This is for Thread.sleep();
                }
            }

            // While table is not empty,
            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    // If there is what customer want.
                    if (dishName.equals(dishes.get(i))) {
                        // Remove this food (ArrayList's mehtod)
                        dishes.remove(i);
                        // Thread in waiting statement is woke up.
                        // Not this method, wake up object when slept in add method(Table's).
                        notify();
                        // Method exit
                        return;
                    }
                }

                try {
                    // Print a log
                    System.out.println(name + " is waiting.");
                    // If this object has a lock on statement,
                    // Lock off and Wait
                    wait();
                    // If this object has not a lock on statement,
                    // Sleep this thread during 500ms.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // This is for Thread.sleep();
                }
            }
        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}

// Runnable
// To be executed by a thread
class Cook implements Runnable {
    // Table is shared
    private Table table;

    Cook(Table table) {
        this.table = table;
    }// Constructor

    @Override
    public void run() {
        while (true) {
            // Choose the food randomly
            int idx = (int) (Math.random() * table.dishNum());
            // Add this food on table
            table.add(table.dishNames[idx]);

            try {
                // Sleep this thread during 500ms.
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // This is for Thread.sleep();
            }
        }
    }

}

class Customer implements Runnable {
    // Table is shared
    private Table table;
    // Customer wants
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food = food;
    }// Constructor

    @Override
    public void run() {
        while (true) {
            try {
                // Sleep this thread during 500ms.
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // This is for Thread.sleep();
            }
            // Get current thread name (=person name)
            String name = Thread.currentThread().getName();
            // Remove this food on table
            table.remove(food);
            // Print a log
            System.out.println(name + " ate a " + food);
        }

    }
}

public class WaitnNotifyEx {
    public static void main(String[] args) throws Exception {
        // Create a table instance
        Table table = new Table();

        // Create 3 new Threads
        // (ObjectName(Components), "ThreadName").start();
        new Thread(new Cook(table), "COOK").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        // If Thread do their job, Threads will sleep.
        Thread.sleep(2000);
        System.exit(0);
    }
}
