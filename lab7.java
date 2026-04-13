public class lab7 {
    /*  NAME: Kevalya Khandelwal
        SAP ID: 5900112117
        BATCH: B1 GG
    */

    static class EvenThread extends Thread {
        @Override
        public void run() {
            for (int number = 2; number <= 20; number += 2) {
                System.out.println("Even: " + number);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    System.out.println(exception);
                }
            }
        }
    }

    static class OddThread extends Thread {
        @Override
        public void run() {
            for (int number = 1; number <= 20; number += 2) {
                System.out.println("Odd: " + number);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    System.out.println(exception);
                }
            }
        }
    }

    static class TableTask implements Runnable {
        private final int tableNumber;

        TableTask(int tableNumber) {
            this.tableNumber = tableNumber;
        }

        @Override
        public void run() {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(tableNumber + " x " + multiplier + " = " + multiplier * tableNumber);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    System.out.println(exception);
                }
            }
        }
    }

    static class MessageTask implements Runnable {
        private final String messageText;

        MessageTask(String messageText) {
            this.messageText = messageText;
        }

        @Override
        public void run() {
            for (int iteration = 0; iteration < 5; iteration++) {
                System.out.println(messageText + " - " + iteration);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception) {
                    System.out.println(exception);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("q1-");

        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
        System.out.println();

        System.out.println("q2-");

        TableTask tableTask1 = new TableTask(5);
        TableTask tableTask2 = new TableTask(7);
        TableTask tableTask3 = new TableTask(10);

        Thread tableThread1 = new Thread(tableTask1);
        Thread tableThread2 = new Thread(tableTask2);
        Thread tableThread3 = new Thread(tableTask3);

        tableThread1.start();
        tableThread2.start();
        tableThread3.start();

        try {
            tableThread1.join();
            tableThread2.join();
            tableThread3.join();
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
        System.out.println();

        System.out.println("q3-");

        MessageTask messageTask1 = new MessageTask("thread 1 working");
        MessageTask messageTask2 = new MessageTask("thread 2 working");

        Thread messageThread1 = new Thread(messageTask1);
        Thread messageThread2 = new Thread(messageTask2);

        messageThread1.start();
        messageThread2.start();

        try {
            messageThread1.join();
            messageThread2.join();
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }

        System.out.println("all tasks are complete");
    }
}
