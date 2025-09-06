// 29. Write a program to implement **Multiple Inheritance** using an interface.

public class TwentyNine
{
    public static class Class1{

    }
    public static class Class2{

    }
    public interface A
    {
      void fun();
        void fun1();

    }

    public interface B extends A
    {
        void fun2();
    }

    public interface C
    {
        void fun3();
    }

    public static class D extends Class1 implements A,B,C
    {
         public void fun()
        {
        System.out.println(0);   
        }
        public void fun1()
        {
        System.out.println(1);   
        }
         public void fun2()
        {
        System.out.println(2);   
        }
         public void fun3()
        {
        System.out.println(3);   
        }
    }
    public static void main(String[] args) {
        D d = new D();
        d.fun1();
         d.fun2();
          d.fun3();
        
    }
}