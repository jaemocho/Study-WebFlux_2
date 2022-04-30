package com.cos.reactivetest;

import java.util.Arrays;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class MyPublisher implements Publisher<Integer>{
	
	Iterable<Integer> its = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

	public void subscribe(Subscriber<? super Integer> s) {
		
		System.out.println("1. 구독할게(구독자)");
		System.out.println("2. 구독 정보를 만들여서 줄게 기다려(발행자)");
		
		MySubscription subscription = new MySubscription(s, its);
		System.out.println("발행사 : 구독 정보 생성 완료 ");
		s.onSubscribe(subscription);
		
	}
}
