package geekbrains.java_level_one.java_lesson_five;

public class Cat extends Animal {
private String name;

    public Cat (String name){
        super(name);
        this.name=name;



    }

    public String getName(){
        return name;
    }

    public boolean run (int length){
        if(length>1000){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public boolean swimming (int length){
        if(length>0){
            return false;

        }
        else{
            return true;

        }
    }
    @Override
    public boolean jumpOver (int length){
        if(length>4){
            return false;

        }
        else {
            return true;

        }

    }
}
