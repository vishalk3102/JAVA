class Q {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();

            } catch (Exception e) {
            }
        }
        System.out.println("put : " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();

            } catch (Exception e) {
            }
        }
        System.out.println("get : " + num);
        valueSet = false;
        notify();
    }
}

class producer implements Runnable {
    Q q;

    public producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "producer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            q.put(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error occurred" + e);
            }
        }
    }
}

class consumer implements Runnable {
    Q q;

    public consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "producer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error occurred" + e);
            }
        }
    }
}

public class producerConsumer {

    public static void main(String[] args) {
        Q q = new Q();
        Runnable p = new producer(q);
        Runnable c = new consumer(q);

    }

}
