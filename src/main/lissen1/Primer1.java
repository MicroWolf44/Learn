package main.lissen1;

public class Primer1 {

    public void primer1(){

        System.out.println("Привет");

    }

    public void primer2(int num){

        System.out.println("Значение переменной num - " + num);
        num = num * 2;
        System.out.println("Значение переменной num * 2 - "+num);
    }

    public void primer3(int x, int y){

        if (x<y){
            System.out.println("X menshe Y");
        }
        else if (x>y){
            System.out.println("X bolshe Y");
        }
        else {
            System.out.println("X raven Y");
        }
    }

    public void primer4(int x, int y){

        for (;x<=y; x++) {
            System.out.println("Znachenie X - " + x);
        }

    }

}
