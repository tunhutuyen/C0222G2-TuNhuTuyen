import java.io.IOException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DemoSafeStringBuidlerAndStringBuffer {
    public static void main(String[] args) {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new AppendableRunnable(stringBuilder));
        }
        shutdownAndAwaitTermination(executorService);

        System.out.println("Thread Builder: " + AppendableRunnable.time + " ms | Length: " + stringBuilder.length());

        AppendableRunnable.time = 0;
        executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new AppendableRunnable(stringBuffer));
        }
        shutdownAndAwaitTermination(executorService);
        System.out.println("Thread Buffer: " + AppendableRunnable.time + " ms | Length: " + stringBuffer.length());

    }

    static void shutdownAndAwaitTermination(ExecutorService pool) {
        pool.shutdown();
        try {
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow();
                if (!pool.awaitTermination(60, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");
            }
        } catch (Exception e) {
        }
    }
}

class AppendableRunnable <T extends Appendable> implements Runnable {
    static long time = 0;
    T appendable;

    public AppendableRunnable(T appendable) {
        this.appendable = appendable;
    }

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            try {
                appendable.append("append string ");
            } catch (IOException e) {
            }
        }
        AppendableRunnable.time += (System.currentTimeMillis() - time);
    }
}
