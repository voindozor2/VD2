package geekbrains.java_level_one.java_lesson_three;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by Борис on 09.04.2017.
 */
public class Third_programm {
    static int x1 , y1 , possible_combo;
    private static int win_combo=3; // в победном стрике из символов считается 0 тоже , т.е если win_combo = 3 , то мы считаем от 0 до 3 , получается 4 символа
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    private static final char EMPTY_SYM = '.';
    private static final char PLAYER_SYM = 'X';
    private static final char COMP_SYM = 'O';
    private static char field [] [] = new char [5] [5];


    private static void init_field () {
        for (int i = 0; i < field.length ; i++) {
            for (int j = 0; j < field.length ; j++) {
                field [i] [j] = EMPTY_SYM;
            }
        }
    }


    private static void print_field () {
        for (int i = 0; i <field.length ; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] );
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isCellOk (int y , int x, char sym) {
        if ( x<0 || y<0 || x >= field.length || y >= field.length) return false;
        if (field[y][x] == sym) return true ;
        return false;
    }

    private static void Player_turn () {
        int x,y;
        do {
            System.out.println("Please input y 1-5 >>>>");
            y = scanner.nextInt();
            System.out.println("Please input x 1-5 >>>>");
            x = scanner.nextInt();
        } while (!isCellOk(y-1,x-1,EMPTY_SYM));
        field [y-1] [x-1] = PLAYER_SYM;
    }

    private static void Comp_turn () {
        int x = 0, y = 0, turn = 0, intelectual_turn = 0, prev = 0;
        /*if(possible_combo(COMP_SYM)) {
            field [y1][x1]=COMP_SYM;
        }
        else {*/
            do {
                x = rand.nextInt(3);
                y = rand.nextInt(3);
            } while (!isCellOk(y, x, EMPTY_SYM));
            if(possible_combo() && isCellOk(y1,x1,EMPTY_SYM)) {

                field[y1][x1] = COMP_SYM;
            }
            else {
                field[y][x] = COMP_SYM;
            }
            }



    //}




    private static boolean Check_Draw () {
        for (int i = 0; i < field.length ; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == EMPTY_SYM) return false ;


            }
        }
        return true;
    }

    private static boolean Check_win2 (char sym) {
        if(field[0][0]==sym && field[1][0]== sym && field [2] [0] == sym) return true; //вертикаль
        if(field[0][1]==sym && field[1][1]== sym && field [2] [1] == sym) return true;
        if(field[0][2]==sym && field[1][2]== sym && field [2] [2] == sym) return true;

        if(field[0][0] == sym && field[0][1] == sym && field[0][2] == sym) return true; //горизонталь
        if(field[1][0] == sym && field[1][1] == sym && field[1][2] == sym) return true;
        if(field[2][0] == sym && field[2][1] == sym && field[2][2] == sym) return true;

        if(field[0][0]==sym && field[1][1]== sym && field [2] [2] == sym) return true;
        if(field[2][0]==sym && field[1][1]== sym && field [0] [2] == sym) return true;
        return false;
    }


    private static boolean Vector_check2 (int y,int x,int vector_x,int vector_y,int length, char sym){ //вектор указывать значениями +1
        int combo=0;

        if(isCellOk(y+(vector_y*length),x+(vector_x*length),sym)){
            for (int i = 1; i < length+1; i++) {
                if(isCellOk(y+(vector_y*i),x+(vector_x*i),sym)){
                    combo++;

                   if(isCellOk(y+(vector_y*(i+1)),x+(vector_x*(i+1)),EMPTY_SYM) || combo == length-1) {
                        y1 = y + (vector_y * (i + 1));
                        x1 = x + (vector_x * (i + 1));
                    }

                    if(combo==length)return true;
                }
            }

        }

    return false;
    }

    private static boolean Vector_check ( int x, int y , int delta_y , int delta_x , char sym ) { //указывать надо вектор равный вин стрику (указывать дельта х и дельта y)
        int a = 0;
        int combo = 0;
        if (isCellOk(y + delta_y, x + delta_x, sym)) {
            for (int i = 0; i < win_combo + 1; i++) {
                if (delta_y == 0) {
                    if (isCellOk(y, x + delta_x - a, sym)) {
                        a++;
                        combo++;
                        if (combo == win_combo) return true;
                    }
                }

                if (delta_x == 0) {
                    if (isCellOk(y + delta_y - a, x, sym)) {
                        a++;
                        combo++;
                        if (combo == win_combo) return true;
                    }
                }
            }

            if (delta_x != 0 && delta_y != 0) {
                for (int j = 0; j < win_combo + 1; j++) {
                    if (isCellOk(y + delta_y + a, x + delta_x - a, sym)) {
                        a++;
                        combo++;
                        if (combo == win_combo) return true;
                    }
                    if (isCellOk(y - delta_y + a, x + delta_x - a, sym)) {
                        a++;
                        combo++;
                        if (combo == win_combo) return true;
                    }
                }
            }



        }
        return false;
    }



    private static boolean Check_win (char sym){
        int i,j;
       for (i = 0; i <field.length ; i++) {
            for (j = 0; j <field.length ; j++) {
                if(field[i][j]==sym){
                    if(Vector_check2(i,j,1,0,win_combo,sym) || Vector_check2(i,j,0,1,win_combo,sym) || Vector_check2(i,j,1,1,win_combo,sym) || Vector_check2(i,j,1,-1,win_combo,sym)) {
                        return true;
                    }
                }
            }

        }



        return false;
    }

    private static boolean possible_combo (){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(Vector_check2(i,j,1,0,win_combo-1,PLAYER_SYM)||Vector_check2(i,j,0,1,win_combo-1,PLAYER_SYM)||Vector_check2(i,j,1,1,win_combo-1,PLAYER_SYM)||Vector_check2(i,j,1,-1,win_combo-1,PLAYER_SYM) ){

                    return true;
                }
            }

        }

        return false;
    }



    public static void main(String[] args) {



        init_field();
        while(true) {
            print_field();
            Player_turn();
            if(Check_Draw()) {
                System.out.println("Draw!");
                break;
            }
            if (Check_win(PLAYER_SYM)){
                System.out.println("Player wins");
                break;
            }
            Comp_turn();
            if(Check_Draw()) {
                System.out.println("Draw!");
                break;
            }

            if(Check_win(COMP_SYM)) {
                System.out.println("Computer wins");
                break;
            }
        }

    }
}
