package com.inflearn.desing_pattern.observer;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

// Reactive Stream 구현을 위해 도입된 라이브러리
// Back pressure를 조절하기 위한 라이브러리
public class FlowInJava {
    public static void main(String[] args) {
        // Publisher, Subscriber, Processor
        // 동기적으로 동작
        /*
        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello flow");
                subscriber.onComplete();
            }
        };
         */

        // 비동기적
        Flow.Publisher<String> publisher = new SubmissionPublisher<>();

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("sub!");
                this.subscription = subscription;
                this.subscription.request(1); // 여기서 한개를 꺼내면
                // 다음으로 자동으로 onNext를 동작시킴
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext called");
                System.out.println(Thread.currentThread().getName());
                System.out.println(s);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);
        // 비동기적으로 동작을 하는 방법
        ((SubmissionPublisher) publisher).submit("hello Java");
        System.out.println("비동기적 호에에엥");
    }

}
