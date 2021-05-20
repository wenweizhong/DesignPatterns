package cn.wen.singleton;

public class Main {
    public static void main(String[] args) {
        Mgr01 mgr = Mgr01.getInstance();
        System.out.println(mgr);
    }
}
