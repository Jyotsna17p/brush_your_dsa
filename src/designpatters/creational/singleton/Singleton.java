package designpatters.creational.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }


    private static Singleton singleton1 =  new Singleton();

    public Singleton getInstance1() {
        return  singleton1;
    }

    private static Singleton singleton2 ;

    public static synchronized Singleton getInstance3(){
        if(singleton2 == null){
            singleton2 = new Singleton();
        }
        return singleton2;
    }


    private static Singleton singleton3;

    public static Singleton getInstance4(){
        if(singleton3 == null){
            synchronized (Singleton.class){
                if(singleton3 == null){
                    singleton3 = new Singleton();
                }
            }
        }
        return singleton3;
    }
}
