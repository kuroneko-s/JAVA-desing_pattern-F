#디자인패턴 학습
###인프런 인강 기반 학습
- https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4



###팩토리 메서드 패턴
- 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적

###추상 팩토리 패턴 
- 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적

팩토리 메서드 패턴은 "팩토리를 구현하는 방법(inheritance)"에 초점을 뒀고, 추상 팩토리 패턴은 "팩토리를 사용하는 방법(composition)"에 초점을 뒀다.

###플라이 웨이트 패턴
그냥 캐싱하는 기능을 넣어주는 거 같기도 하고 ???

### 데코레이션 패턴
코드를 건드리지 않고 확장을 할 수 있다.(Wrapper)
-> 개신기함 

### 퍼사드 패턴
코드를 클래스에 넣어서 감추는 것

### 프록시 패턴
데코레이션 패턴이랑 유사하긴 함 
자바에서 dinamic proxy Java로 구현가능함
AOP쪽을 보면 자세하게 구현되어있음


### 책임 연쇄 패턴
데코레이션 패턴에 의미를 부여한 방법같은 느낌임
방식은 완전히 동일한듯 ?
스프링 시큐리티 configure가 필터 설정하는 놈이고
WebFilter기능도 있었고 
