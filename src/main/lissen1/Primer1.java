package main.lissen1;

public class Primer1 {

    /**
     * Primer prostoi programmi vivoda
     * @param text stroka
     */
    public void primer1(String text){

        System.out.println(text);

    }

    /**
     * Primer vtoroi prostoi programmi,
     * kotoraya vivodit znachenie
     * potom peremnozhaet na 2 i vivodit ego
     * @param num chislo
     */
    public void primer2(int num){

        System.out.println("Значение переменной num - " + num);
        num = num * 2;
        System.out.println("Значение переменной num * 2 - "+num);
    }

    /**
     * Primer programmi sravneniya chisel s ispolzovaniem IF
     * @param x pervoe chislo
     * @param y vtoroe chislo
     */
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

    /**
     * Primer programmi vivoda opredelennogo kolichestva strok s ispolzovaniem FOR
     * @param x minimalnoe znachenie
     * @param y maximalnoe znachenie
     */
    public void primer4(int x, int y){

        for (; x<=y; x++) {
            System.out.println("Znachenie X - " + x);
        }
    }

    /**
     * Primer progpammi vivoda znachenii X i Y s dvumya schetchikami
     * @param x pervoe chislo
     * @param y vtoroe chislo
     */
    public void primer5(int x, int y){

        for ( ; x<=y; x++){
            System.out.println("X ravno - " +x);
            System.out.println("Y ravno - "+y);
            y=y-2;
        }
    }

}
