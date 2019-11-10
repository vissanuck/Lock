import java.util.concurrent.locks.ReentrantLock;

public class Lock
    {
        public static ReentrantLock lockNum = new ReentrantLock();

        public static void main(String[] args) throws InterruptedException
        {

            Thread t1 = new thread1();
            Thread t2 = new thread2();
            Thread t3 = new thread3();

            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }

            public static class thread1 extends Thread
            {
                public void run()
                {
                    for (int number = 1; number<=10 ; number++)
                    {
                        if(number>=5 && number<=7)
                        {
                            lockNum.lock();
                            System.out.println("Thread 1 Lock : "+number);
                            lockNum.unlock();
                        }else
                            {
                                System.out.println("Thread 1 : "+number);
                            }
                    }
                }

            }


            public static class thread2 extends Thread
            {
                public void run()
                {
                    for (int number = 1; number<=10 ; number++)
                    {
                        if(number>=5 && number<=7)
                        {
                            lockNum.lock();
                            System.out.println("Thread 2 Lock : "+number);
                            lockNum.unlock();
                        }else
                            {
                            System.out.println("Thread 2 : "+number);
                            }
                    }
                }
            }


            public  static class thread3 extends Thread
            {
                public void run()
                {
                    for (int number = 1; number<=10 ; number++)
                    {
                        if(number>=5 && number<=7)
                        {
                            lockNum.lock();
                            System.out.println("Thread 3 Lock : "+number);
                            lockNum.unlock();
                        }else
                            {
                                System.out.println("Thread 3 : "+number);
                            }
                    }
                }

            }
}

