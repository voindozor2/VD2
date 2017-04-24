package geekbrains.java_level_one.java_lesson_five;




// 1.	Создать несколько классов: Собака, Лошадь, Кот - с наследованием от родительского класса Животное.
// 2.	Все классы должны иметь возможность выполнять действия: бежать, плыть, перепрыгивать препятствие.
// 3.	У каждого класса свои ограничения на каждое из действий
// (например, высота прыжка, собака может перепрыгнуть максимум полуметровое препятствие, кот 1-2 метровое;
// считаем что коты не умеют плавать и т.д.). Каждое действие должно выводить результат в консоль(смогло животное
// выполнить действие, или нет).


public class Five_programm {

    public static void smogli (String name){
        System.out.println(name + " не преодолел(а) такое большое расстояние!");
    }

    public static void ne_smogli (String name){
        System.out.println(name + " и не преодолел(а) такое большое расстояние!");
    }

    public static void main(String[] args) {


        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Murzik");
        animals[1] = new Dog("Sharik");
        animals[2] = new Horse("Agat");


        for (int i = 1; i < 6 ; i++) {

            System.out.println("________________________________________________________");
            System.out.println("Участники марафона должны бежать на " + i*100 + " метров");
            if(animals[0].run(i*100)){
               smogli(animals[0].getName());
            }
            else {
                ne_smogli(animals[0].getName());
            }

            if(animals[1].run(i*100)){
                smogli(animals[1].getName());
            }
            else {
                ne_smogli(animals[1].getName());
            }
            if(animals[2].run(i*100)){
                smogli(animals[2].getName());
            }
            else {
                ne_smogli(animals[2].getName());
            }

            System.out.println("________________________________________________________");
            System.out.println("Участники марафона должны плыть на "+ i*50 + " метров");
            if(animals[0].swimming(i*50)){
                smogli(animals[0].getName());
            }
            else {
                ne_smogli(animals[0].getName());
            }

            if(animals[1].swimming(i*50)){
                smogli(animals[1].getName());
            }
            else {
                ne_smogli(animals[1].getName());
            }

            if(animals[2].swimming(i*50)){
                smogli(animals[2].getName());
            }
            else {
                ne_smogli(animals[2].getName());
            }



            System.out.println("________________________________________________________");
            System.out.println("Участники марафона должны прыгать на " + i + " метров");
            if(animals[0].swimming(i)){
                smogli(animals[0].getName());
            }
            else {
                ne_smogli(animals[0].getName());
            }
            if(animals[1].swimming(i)){
                smogli(animals[1].getName());
            }
            else {
                ne_smogli(animals[1].getName());
            }
            if(animals[2].swimming(i)){
                smogli(animals[2].getName());
            }
            else {
                ne_smogli(animals[2].getName());
            }

        }


    }




}
