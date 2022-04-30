# Study-WebFlux_2
Reactive Stream test

1. Publisher에 본인이 소유할 Subscription을 구현하고 publishing할 data를 만듭니다.  


2. Publisher는 subscribe() 메서드를 통해 subscriber를 등록합니다.  

3. Subscriber는 onSubscribe() 메서드를 통해 Subscription을 등록하고 Publisher를 구독하기 시작합니다. 
  
    이는 Publisher에 구현된 Subscription을 통해 이루어집니다. 
  
    이렇게 하면 Publisher와 Subscriber는 Subscription을 통해 연결된 상태가 됩니다. 
    
    onSubscribe() 내부에 Subscription의 request()를 요청하면 그때부터 data 구독이 시작됩니다.  


5. Suscriber는 Subscription 메서드의 request() 또는 cancel()을 호출을 통해 data의 흐름을 제어할 수 있습니다.  


6. Subscription의 request()에는 조건에 따라 Subscriber의 onNext(), onComplete() 또는 onError()를 호출합니다.   그러면 Subscriber의 해당 메서드의 로직에 따라 request() 또는 cancle()로 제어하게 됩니다.


BackPressure (배압)
