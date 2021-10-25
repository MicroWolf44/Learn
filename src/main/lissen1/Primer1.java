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

    /**
     * Primer rascheta skorosti sveta
     * @param day kolichestvo dnei
     */
    public void primer6(double day){

        int lightspeed = 186000;
        double second = day * 24 *60 * 60;
        double distance = lightspeed + second;

        System.out.print("Za " + day + " dnei ");
        System.out.println("svet proidet okolo " + distance + " mil");
    }

    /**
     * Primer vichisleniyz ploshadi kruga
     * @param radios radios kruga
     */
    public void primer7(double radios){

        final double pi = 3.1416;
        double ploshad = pi * radios * radios;

        System.out.println("Ploshad kruga ravna " + ploshad);
    }

    /**
     * Primer demonstracii primeneniya tipa CHAR
     * @param pervii pervii simvol
     * @param vtoroi vtooi simvol
     */
    public void primer8(char pervii, char vtoroi){

        System.out.println("Pervii simvol - " + pervii);
        System.out.println("Vtoroi simvol - " + vtoroi);
    }

    /**
     * Primer matematicheskogo izmeneniya simvola
     * @param simvol
     */
    public void primer9(char simvol){

        System.out.println("Simvol - " + simvol);
        simvol++;
        System.out.println("Simvol posle uvelocheniya na 1 - " + simvol);
    }

    /**
     * Primer demonstracii tipa BOOLEAN
     */
    public void primer10(){

        boolean b = false;
        System.out.println("b ravno " + b);
        b = true;
        System.out.println("b ravno " + b);
        if (b) System.out.println("Etot kod vipolnyaetsa");
        b = true;
        if (b) System.out.println("Etot kod ne vipolnyaetsa");
        System.out.println("10>9 ravno " + (10>9));
    }

}
