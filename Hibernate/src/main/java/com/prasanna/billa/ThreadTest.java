package  com.prasanna.billa;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ThreadTest {

    public static void main(String[] args) {
        try {
            new ThreadTest().poolRun();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void print(String m) {
        System.out.println(m);
    }

    public class One implements Callable<Integer> {

        public Integer call() throws Exception {
            print("One...");
            Thread.sleep(6000);
            print("One!!");
            return 100;
        }
    }

    public class Two implements Callable<String> {

        public String call() throws InterruptedException {
            print("Two...");
            Thread.sleep(1000);
            print("Two!!");
            return "Done";
        }
    }

    public class Three implements Callable<Boolean> {

        public Boolean call() throws Exception {
            print("Three...");
            Thread.sleep(2000);
            print("Three!!");
            return true;
        }
    }

    public void poolRun() throws InterruptedException, ExecutionException {
        int n = 3;
        // Build a fixed number of thread pool
        ExecutorService pool = Executors.newFixedThreadPool(n);
        // Wait until One finishes it's task.
        pool.submit(new One());
        // Wait until Two finishes it's task.
        pool.submit(new Two());
        // Wait until Three finishes it's task.
        pool.submit(new Three());
        pool.shutdown();
    }
}