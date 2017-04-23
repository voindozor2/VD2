package geekbrains.java_level_one.java_lesson_four;

/**
 * Created by Борис on 23.04.2017.
 */


public class Four_programm {

    public static int middle_zarplata (Employe persArray[]){
        int middle_zarplata=0;

        for (int i = 0; i < persArray.length ; i++) {
            middle_zarplata = middle_zarplata + persArray[i].getZarplata();
        }
        return middle_zarplata / persArray.length;

    }

    public static int middle_age (Employe persArray[]){
        int middle_age=0;

        for (int i = 0; i < persArray.length ; i++) {
            middle_age = middle_age + persArray[i].getAge();
        }
        return middle_age / persArray.length;

    }

    public static void inf_sotr (Employe persArray[],int age){
        for (int i = 0; i < persArray.length ; i++) {

            if(persArray[i].getAge()>age){
                System.out.println("    Sotrudnik nomer " + i);
                System.out.println("    FIO " + persArray[i].getFIO());
                System.out.println("    Dolzhnost   " + persArray[i].getdolzhnost());
                System.out.println("    Telefon " + persArray[i].gettelefon());
                System.out.println("    Zarplata    " + persArray[i].getZarplata());
                System.out.println("    Age " + persArray[i].getAge());
                System.out.println("--------------------------");
            }



        }

    }

    public static void pribavka(Employe persArray[],int age , int pribavka) {
        for (int i = 0; i <persArray.length ; i++) {
            if (persArray[i].getAge()>age){
                persArray[i].setPribavka(pribavka);
            }
        }
    }
    private String fio;
    private String dolzhnost;
    private int telefon;
    private int zarplata;
    private int age;
    public static void main(String[] args) {

        Employe[] persArray= new Employe[5];
        persArray[0]=new Employe("Nurlan Abusaev Nurlanovich" , "killer" , 812399955 ,  40000 , 59 );
        persArray[1]=new Employe("Ahmed Abusaev Nurlanovich" , "medic" , 812399956 ,  50000 , 49 );
        persArray[2]=new Employe("Andrey Abusaev Nurlanovich" , "Padavan" , 81233357 ,  5000 , 79 );
        persArray[3]=new Employe("Ruslan Abusaev Nurlanovich" , "Sith" , 81239958 ,  1000 , 39 );
        persArray[4]=new Employe("Dmitriy Abusaev Nurlanovich" , "Kancler" , 81293359 ,  10000 , 30 );

        inf_sotr(persArray,40);
        pribavka(persArray,45,5000);
        inf_sotr(persArray,45 );
        System.out.println("Middle age " + middle_age(persArray));
        System.out.println("Middle zarplata " + middle_zarplata(persArray));

    }

}
