package cn.wen.singleton;


/*饿汉式
* 类加载到内存，就实例化一个单例，JVM保证线程安全
* 缺点：用与否都是事先类装载时候就完成了实例化
* */
public class Mgr01 {
    //定义静态实例
    private static final Mgr01 INSTANCE = new Mgr01();

    //将构造方法设计出private
    private Mgr01(){

    }

    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01 == mgr02);
    }
}
