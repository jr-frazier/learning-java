public class Main {
    public static void main(String[] args) {
        // The Code below is an example using the ThreaadExample class that is and extension of the Thread class
//        ThreadExample thread1 = new ThreadExample();
//        thread1.setName("First Thread");
//        thread1.start();
//
//        ThreadExample thread2 = new ThreadExample();
//        thread2.setName("Second Thread");
//        thread2.start();

        // The Code below it an example using the RunnableExample class which implements the Runnable interface
        Thread runnableThread1 = new Thread(new RunnableExample());
        runnableThread1.setName("Runnable 1");
        runnableThread1.start();

        Thread runnableThread2 = new Thread(new RunnableExample());
        runnableThread2.setName("Runnable 2");
        runnableThread2.start();

        Thread runnableThread3 = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });

        runnableThread3.setName("Runnable 3");
        runnableThread3.start();

    }
}