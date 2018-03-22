import java.lang.reflect.Proxy;

import wantao.su.designpattern.proxy.ProxySubject;
import wantao.su.designpattern.proxy.RealSubject;
import wantao.su.designpattern.proxy.Subject;
import wantao.su.designpattern.proxy.dynamicproxy.DynamicSubject;

/**
 * Created by suwantao on 2018/3/20.
 */

public class MainTestUnit {
    public static void main(String args[]) {
//        staticProxyTest();
        dynmicProxyTest();
    }

    /**
     * 动态代理测试
     */
    private static void dynmicProxyTest() {
        RealSubject target = new RealSubject();
        DynamicSubject invocationHandler = new DynamicSubject(target);
        Subject subject = (Subject) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
        subject.print();
    }

    /**
     * 静态代理测试
     */
    private static void staticProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.print();
    }
}
