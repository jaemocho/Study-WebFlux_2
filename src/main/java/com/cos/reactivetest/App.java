package com.cos.reactivetest;


//참고 자료 https://sjh836.tistory.com/182

//WebFlux = 단일스레드, 비동기 + Stream을 통해 백프레셔가 적용된 데이터만큼 간헐정 응답이 가능하다 + 데이터 소비가 끝나면 응답이 종료
//SSE 적용(Servlet, WebFlux) = 데이터 소비가 끝나도 Stream 계속 유지
public class App {
	public static void main(String[] args) {
		MyPublisher publisher = new MyPublisher(); //신문사 생성
		MySubscriber subscriber = new MySubscriber(); //구독자 생성
		
		publisher.subscribe(subscriber);
		
		
	}
}
