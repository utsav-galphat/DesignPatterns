package Multithreading.basic;

public class AlphaNum {

    public final Object alphaLock = new Object();
    public final Object numLock = new Object();
    public  void num(){
        synchronized (numLock) {
            for(int i=0; i<10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public  void alpha(){
        synchronized (alphaLock) {
            for(int i=65; i<75; i++){
                System.out.println((char)i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
