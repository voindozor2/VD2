package geekbrains.java_level_one.java_lesson_four;

/**
 * Created by Борис on 23.04.2017.
 */
public class Employe {
    private String fio;
    private String dolzhnost;
    private int telefon;
    private int zarplata;
    private int age;

    public Employe (String fio, String dolzhnost , int telefon , int zarplata , int age){
        this.fio=fio;
        this.dolzhnost=dolzhnost;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.age = age;

    }


    public int getAge () {
        return age;
    }

    public int getZarplata () {
        return zarplata;
    }

    public int gettelefon (){
        return telefon;
    }

    public String getFIO () {
        return fio;
    }

    public String getdolzhnost(){
        return dolzhnost;
    }

    public void setPribavka (int pribavka){
        this.zarplata = zarplata + pribavka;

    }
}
