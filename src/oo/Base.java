package oo;

public class Base {
    public Base() {
        System.out.println("父类");
    }

    /**
     * 父类实例变量
     */
    String var = "baseVar";
    /**
     * 父类的静态变量
     */
    static String staticVar = "staticBaseVar";

    /**
     * 父类实例方法
     */
    void method() {
        System.out.println("Base method");
    }

    /**
     * 父类静态方法
     */
    static void staticMethod() {
        System.out.println("Base static Method");
    }
}

class Sub extends Base {
    public Sub() {
        System.out.println("子类");
    }

    /**
     * 子类的实例变量
     */
    String var = "subVar";
    /**
     * 子类的静态变量
     */
    static String staticVar = "staticSubVar";

    // 覆盖父类的method()方法
    void method() {
        System.out.println("Sub static Method");
    }

    String subVar = "var only belonging to Sub";

    void subMethod() {
        System.out.println("Method only belonging to Sub");
    }

    public static void main(String args[]) {
        // who 被声明为Base类型，引用Sub实例
        Base who = new Sub();
//        Sub who = new Sub();
        System.out.println("who.var=" + who.var);// print:who.var=baseVar
        System.out.println("who.staticVar=" + who.staticVar);// print:who.staticVar=staticBaseVar
        who.method();// print:Sub static Metho
        // 这里为什么不打印Base method呢 这是java动态机制的表现,
        // 虽然who的类型是Base 但是 实际引用的是Sub类 new Sub()会在堆区分配内存空间
        // 当who.method()方法时，jvm会根据who持有的引用定位到堆区的Sub实例
        // 再根据Sub持有的引用 定位到方法区Sub类的类型信息 获得method的字节
        // 在当前环境下(上面代码所示)获得method的字节码，此时Sub类复写了Base的method的方法,
        // 获得method的字节码，直接执行method包含的指令,
        // 如果没有复写method方法 则去获得Base类的字节码 执行包含的指令(这个机制实现有待去研究有关资料)

//        who.staticMethod();// print:Base static Method

        // who.subVar="123";//编译错误
        // who.subMethod();//编译错误
        // 对于一个引用变量，java编译器按照它什么的类型来处理，这里who 的类型是Base类型的引用变量.不存在subVar
        // 和subMethod方法
        // 如果要访问Sub类成员,可以进行强制类型转换(向下转型)


     /*   Sub sub = (Sub) who;
        sub.subVar = "23";
        sub.subMethod();

        Base base2 = new Base();
        Sub sub2 = (Sub) base2;
        sub2.subMethod();*/
        // 编译通过 但是抛出ClassCastException
        // sub2实际引用的是Base实例
        // 对应一个引用类型的变量，运行时jvm按照它实际引用的对象来处理，假设上面能够通过，但是
        // 当我们sub2引用变量调用subMethod()方法时，我们看到在Base类中并没有subMethod方法。
        // 由此可见 ,子类对象可以向上转型为父类对象，但是父类对象不能转换为子类对象,父类拥有的成员子类
        // 子类肯定也有，而子类拥有的成员父类不一定有。上面就是一个例子。

        // 在运行时环境中，通过引用类型变量来访问所引用的方法和属性时，java虚拟机采用如下绑定机制。
        // 1 实例方法与引用变量 实际引用的对象 的方法绑定 属于动态绑定.由运行时jvm动态决定的。
        // 2 静态方法与引用变了所声明的对象 的方法绑定 属于静态绑定 在编译阶段就已经做了绑定
        // 3 成员变量 （静态和实例）与引用变量所声明的类型的成员变量绑定属于静态绑定。
    }
}
