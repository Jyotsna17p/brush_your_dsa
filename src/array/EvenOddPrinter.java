package array;

public class EvenOddPrinter {

    int maxPrint;
    int startNumber;

    public EvenOddPrinter(int maxPrint , int startNumber){
        this.maxPrint = maxPrint;
        this.startNumber = startNumber;
    }

    public synchronized void printOdd() throws InterruptedException {
        while(startNumber< maxPrint) {
            if (startNumber % 2 == 1 && Thread.currentThread().getName().equals("ODD")) {
                System.out.println(Thread.currentThread().getName() + " : " + startNumber);
                startNumber++;
                notify();
            } else {
                wait();
            }
        }
   }

   public synchronized  void printEven() throws InterruptedException{
       while(startNumber < maxPrint) {
           if (startNumber % 2 == 0 && Thread.currentThread().getName().equals("EVEN")) {
               System.out.println(Thread.currentThread().getName() + " : " + startNumber);
               startNumber++;
               notify();
           } else {
               wait();
           }
       }
   }

}
