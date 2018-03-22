package wantao.su.designpattern.proxy;

/**
 * Created by suwantao on 2018/3/20.
 */

public class ProxySubject implements Subject {
    private RealSubject mRealSubject;

    public ProxySubject(RealSubject realSubject) {
        this.mRealSubject = realSubject;
    }

    @Override
    public void print() {
        System.out.println("打印ProxySubject");
        mRealSubject.print();

    }
}
