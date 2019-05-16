package zad3.two;

import zad3.one.Tim;

public class Main {

    static int[] array = new int[0];

    public static void main(String[] args) {
        for (int n = 100; n <= 10_0000; n *= 10) {

            Tim.start();
            for (int i = 0; i < n; i++) {
                noException();
            }
            Tim.stop(n, "noException");


            Tim.start();
            for (int i = 0; i < n; i++) {
                exceptionCaught();
            }
            Tim.stop(n, "exceptionCaught");


            Tim.start();
            for (int i = 0; i < n; i++) {
                try{
                    exceptionThrown();
                } catch (ArithmeticException ignored){

                }
            }
            Tim.stop(n, "exceptionThrown");

        }

    }

    private static void noException() {
        int x = 0;
        if(x != 0){
            x = 1/x;
        }
    }

    private static void exceptionCaught() {
        try{
            int x = 1/0;
        } catch (ArithmeticException e){

        }
    }


    private static void exceptionThrown() throws ArithmeticException{
        int x = 1/0;
    }

}
