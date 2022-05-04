# 디자인패턴 학습   
### 인프런 인강 기반 학습
- https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4

### 팩토리 메서드 패턴
- 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적 
- 인스턴스를 생성하는 책임을 추상적인 인터페이스의 메서드로 감싸는 것이다

### 추상 팩토리 패턴 
- 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적

팩토리 메서드 패턴은 "팩토리를 구현하는 방법(inheritance)"에 초점을 뒀고, 추상 팩토리 패턴은 "팩토리를 사용하는 방법(composition)"에 초점을 뒀다.

### 플라이 웨이트 패턴
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

### 커맨드 패턴
인터페이스 따고 각각 구현하고 사용하는곳에서 커맨드 인터페이스 넣어서 사용하기 쉽게 하는거

### 인터프리터 패턴
인터프리터 - 무언가를 무언가로 바꿔주는 역할
자주 사용되는 문제나 패턴이 있다 -> 이때 사용함 

### 이터레이터 패턴
반복자
StAX, SAX -> XML 읽을떄 도와주는 라이브러리 

### 중개자 패턴
직접적인 의존관계를 지양하고 간접적으로 총관리하는 관제탑(중개자)를 생성해서 해당 중개자를 통해서 의존을 생성하는 패턴

### 메멘토 패턴
객체 내부의 상태를 외부에 저장, 복원을 할 수 있는데 이때 캡슐화를 유지한 상태로 진행이 가능
-> 실행취소 (Ctrl + Z), 게임의 일시정지 등
-> 간단함

### 옵저버 패턴
특정 객체 상태 변화를 감지하고 알림을 받는 패턴
spring boot에서 interceptor 말하는 거로 알고있음ㄷ
Weak Reference (HashMap에 약한 참조를 사용하는 경우가 많다) -> CG를 사용을 하기 위해서
-> 근데 명시적으로 해지를 하는게 가장 좋다. 이렇게 해지를 못하는 경우에만 Weak Reference를 사용 ( 언제 없어질지를 보장을 못함 )
스프링에서 @EventListener(Class Name) 으로 사용하는 거, 상속 구현해서 사용하는 법 있음

### 상태 패턴
객체의 상태에 따라서 동작을 다르게 하는 패턴
ex) 리모콘
interface나 추상 클래스가 거의 반드시 있어야하는 패턴
Context와 State가 중요함
주로 비지니스 코드가 들어설때 생기는 문제들을 해결하기 위한 패턴임

### 전략 패턴
알고리즘을 각각의 개별적으로 캡슐화를 하고 캡슐화 된걸 공통의 인터페이스로 추상화를 해서 사용할땐 추상화한 인터페이스를 사용해서 필요에 따라 알고리즘을 바꿔끼우는 패턴
ex) Comparable
이 패턴이 되게 괜찮다.
