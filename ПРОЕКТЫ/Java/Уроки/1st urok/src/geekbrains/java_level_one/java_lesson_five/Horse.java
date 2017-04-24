package geekbrains.java_level_one.java_lesson_five;

public class Horse extends Animal {
String name;
    public Horse (String name){
        super(name);
        this.name=name;

    }

    public String getName(){
        return name;
    }

    @Override
    public boolean run (int length){
        if(length>20000){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public boolean swimming (int length){
        if(length>1000){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public boolean jumpOver (int length){
        if(length>2){
            return false;
        }
        else {
            return true;
        }

    }
}
