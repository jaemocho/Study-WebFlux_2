package com.cos.reactivetest;


//���� �ڷ� https://sjh836.tistory.com/182

//WebFlux = ���Ͻ�����, �񵿱� + Stream�� ���� �������Ű� ����� �����͸�ŭ ������ ������ �����ϴ� + ������ �Һ� ������ ������ ����
//SSE ����(Servlet, WebFlux) = ������ �Һ� ������ Stream ��� ����
public class App {
	public static void main(String[] args) {
		MyPublisher publisher = new MyPublisher(); //�Ź��� ����
		MySubscriber subscriber = new MySubscriber(); //������ ����
		
		publisher.subscribe(subscriber);
		
		
	}
}
