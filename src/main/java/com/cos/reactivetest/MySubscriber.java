package com.cos.reactivetest;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySubscriber implements Subscriber<Integer> {
	
	private Subscription s;
	private int bufferSize = 3;

	public void onSubscribe(Subscription s) {
		System.out.println("구독자 : 구독 정보 받기 완료");
		this.s = s;
		s.request(bufferSize); // 1개 씩 매일매일 줘 (백프레셔) 소비자가 한번에 처리할 수 있는 개수를 요청
	}

	public void onNext(Integer t) {
		System.out.println("구독 데이터 전달" + " " + t);
		bufferSize--;
		if(bufferSize == 0) {
			System.out.println("하루 지남");
			bufferSize = 3;
			s.request(bufferSize);
		}
	}

	public void onError(Throwable t) {
		System.out.println("구독 중 에러");
		
	}

	public void onComplete() {
		System.out.println("구독 완료");
	}

}
