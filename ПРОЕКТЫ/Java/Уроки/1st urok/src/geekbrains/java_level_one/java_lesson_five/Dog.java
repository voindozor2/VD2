package geekbrains.java_level_one.java_lesson_five;

public class Dog extends Animal{
String name;
    public Dog (String name){
        super(name);
        this.name=name;

    }

    public String getName(){
        return name;
    }

    public boolean run (int length){
        if(length>2000){
            return false;
        }
        else{
        return true;
        }
    }
    @Override
    public boolean swimming (int length){
        if(length>2000){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public boolean jumpOver (int length){
        if(length>1){
            return false;
        }
        else {
            return true;
        }

    }
}
