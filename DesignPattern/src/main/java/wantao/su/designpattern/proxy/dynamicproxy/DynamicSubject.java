package wantao.su.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by suwantao on 2018/3/20.
 */

public class DynamicSubject implements InvocationHandler {
    // 真实对象的引用
    private Object mTarget;

    public DynamicSubject(Object target) {
        this.mTarget = target;
    }

    /**
     * @param proxy  一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
     * @param method 一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
     * @param args   一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------------------before------------------");
        Object result = method.invoke(mTarget, args);
        System.out.println("-------------------after------------------");
        return result;
    }

}
