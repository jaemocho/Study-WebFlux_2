package com.cos.reactivetest;

import java.util.Arrays;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class MyPublisher implements Publisher<Integer>{
	
	Iterable<Integer> its = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

	public void subscribe(Subscriber<? super Integer> s) {
		
		System.out.println("1. �����Ұ�(������)");
		System.out.println("2. ���� ������ ���鿩�� �ٰ� ��ٷ�(������)");
		
		MySubscription subscription = new MySubscription(s, its);
		System.out.println("����� : ���� ���� ���� �Ϸ� ");
		s.onSubscribe(subscription);
		
	}
}
