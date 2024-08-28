Java 21 LTS 버전부터 정식으로 Virtual Thread가 포함되었습니다. Virtual Thread 란 무엇일까요?     
<br>
오라클 공식 문서에 있는 표현은 다음과 같습니다.       
"Virtual threads are lightweight threads that reduce the effort of writing, maintaining, and debugging       
high-throughput concurrent applications."     

간단하게 해석해보면 처리량이 높은 애플리케이션을 만들 때 유지 관리 및 디버깅의 노력을 줄여주는 경량 쓰레드입니다.        
경량 쓰레드라는 말을 처음 보았을 때 CPU 코어를 더 잘 활용하기 위해 쓰레드 개념이 나온 것처럼 경량 쓰레드가 나온 이유도    
뭔가 비슷한 이유가 아닐까 라는 생각만 들었습니다.  
<br>
아래 링크의 글에서는 Virtual Thread에 대해 다음과 같은 순서로 다루었습니다.      


1. Virtual Thread의 특징 - 생성/실행 속도 빠름, 스케줄링 방식, Non-Blocking I/O       
2. 기존 쓰레드 풀 방식의 병목 지점과 이를 개선한 방식
3. 성능 테스트    
4. Virtual Thread의 단점

[Java Virtual Thread 에 대해 알아보자](https://320hwany.tistory.com/121)        
 
