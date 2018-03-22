package wantao.su.designpattern.proxy;

/**
 * Created by suwantao on 2018/3/20.
 */

public class RealSubject implements Subject {
    @Override
    public void print() {
        System.out.println("---------------RealSubject--------------");
    }
}
