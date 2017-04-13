package geekbrains.java_level_one.java_lesson_one;


public class First_programm {
    public static int uravnenie(int a,int b,int c,int d) {
		return a * (b + (c / d));
    }
	
    public static boolean sravnenie(int a) {
        return ((a >= 10) && (a <= 20));
    }
    public static boolean visokosnii_god(int year) {
        boolean vivod=false;

        int sotii=year%100;;

        if(year%4==0) {
            if(sotii!=0) {
            vivod=true;
            }
            else {
            vivod=false;
            }
        }


        return (year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0);
    }

    public static void main(String[] args){
        boolean boll=false;
        byte byt=0;
        short shor=0;
        int cel=0;
        long lon=20;

        float fl=0.0f;
        double doubl=0.0;

        final int CONST=0;

        System.out.println("a*(b+(c/d))   a=1 b=2 c=3 d=4   ="+ uravnenie( 1 , 2, 3,4));
        System.out.println("определение числа 15 в пределах от 10 до 20    "+sravnenie(15));
        System.out.println("определение числа 5 в пределах от 10 до 20    "+sravnenie(5));
        System.out.println("2016?   "+visokosnii_god(2016));
        System.out.println("2017?   "+visokosnii_god( 2017));
    }
}


