package com.inflearn.desing_pattern.singletone;


/*
    이렇게 사용할 경우 Enum 클래스를 컴파일단계에서 상속을 받아버려서 다른 객체를 상속받을 수 없다.
    인스턴스가 호출시 바로 생성이 되어버린다 ( STATIC )
 */
public enum AnotherSettings {
    INSTANCE;
}
