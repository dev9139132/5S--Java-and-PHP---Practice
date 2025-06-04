class NewClass
{
    static void func1()
    {
        System.out.println("Output from funcfunc1");
    }

    static void func2()
    {
        System.out.println("Output from func2");
    }
}


class Hello
{
    public static void main(String []args)
    {
        NewClass n1 = new NewClass();
        n1.func1();
        n1.func2();

    }
}
funcfunc