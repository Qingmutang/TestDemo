package tony.test.ali;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadUtils {

    private static Executor executor = Executors.newFixedThreadPool(3);

    public static void run(Runnable runnable) {
        executor.execute(runnable);
    }
}