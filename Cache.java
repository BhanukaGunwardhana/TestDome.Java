package Java_Advanced.TestDomeTests;

public class Cache {

    
}
class A extends Cache{}
class B extends A{}
class Main{
    public static void main(String[] args) {
        //A a=new A();
        B b=new B();
        Cache cache=(Cache) b;
        A a=(A) cache;



        
}
}
