package org.course.stream;

public class Ex12 {
    static final Object object = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplementationMobile());
        Thread thread2 = new Thread(new RunnableImplementationSkype());
        Thread thread3 = new Thread(new RunnableImplementationWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }

    void mobileCall()  {
        synchronized(object){
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Mobile call ends");
        }
    }

    void skypeCall()  {
        synchronized(object){
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsappCall()  {
        synchronized(object){
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call ends");
        }

    }


}

class RunnableImplementationMobile implements Runnable{
    @Override
    public void run() {
         new Ex12().mobileCall();
    }
}

class RunnableImplementationSkype implements Runnable{
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplementationWhatsapp implements Runnable{
    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}
