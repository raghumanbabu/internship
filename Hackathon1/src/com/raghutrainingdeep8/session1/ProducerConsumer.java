package com.raghutrainingdeep8.session1;

import com.raghutraining.session13.Counter;

public class ProducerConsumer {

    private static int[] buffer;
    private static int count;

    static class Producer {
        void produce(){
            while(isFull(buffer)){
                //do nothing
            }
            buffer[count++] = 1;
        }
    }

    static class Consumer {
        void consume(){
            while(isEmpty(buffer)){
                //do nothing
            }
            buffer[--count] = 0;
        }
    }

    static boolean isFull(int[] buffer){
        return count == buffer.length;
    }

    static boolean isEmpty(int[] buffer){
        return 0 == buffer.length;
    }

    static void logic(){
        Producer p = new Producer();
        Consumer c = new Consumer();

        Thread t1 = new Thread(() -> {
            int a = 2;
            a++;
            System.out.println(a);
            System.out.println("Hello Raghu!!!");
        });
        t1.setName("RaghuThread");
        t1.start();
        System.out.println("Hello Parthi!!!");



    }

}
