package com.study.basic.ch05.generic.gmethod;

// 제네릭 메서드란?
// 자료형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드
// 자료형 매개 변수가 하나 이상인 경우도 있음
// 제네릭 클래스가 아니어도 내부에 제네릭 메서드는 구현하여 사용 할 수 있음
// public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개변수.....) { }
public class Point<T, V> {

    // 두 점(top, bottom)을 기준으로 사각형을 만들 때 사각형의 너비를 구하는 메서드를 만들어 보자
    // 두 점은 정수인 경우도 있고, 실수인 경우도 있으므로 제네릭 타입을 사용하여 구현한다.
    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

}
