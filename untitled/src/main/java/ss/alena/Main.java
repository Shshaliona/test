package ss.alena;

import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        for(int i =0; i<=100; i++){
            Thread thread = new Thread(i);
            thread.run();
        }
    }

    class Counter {
        AtomicInteger count = new AtomicInteger();

        void increment() {
            count.incrementAndGet();
        }
    }
}
