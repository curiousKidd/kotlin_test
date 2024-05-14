## TEST Project

kotlin 공부용 프로젝트
java project -> kotlin project 변경
kotlin 학습 및 동일한 기능을 하는 프로젝트 생성
기본 학습용 프로젝트

1일차 프로젝트 실행

```text
Cannot inline bytecode built with JVM target 17 into bytecode that is being built with JVM target 1.8. Please specify proper '-jvm-target' option
```

에러 발생.... 아직 정확한 사유 찾지 못함

2일차 -> 1일차에 발생한 오류 해결
-> 이유는 intellij version 문제.... 혹시라도 비슷한 문구의 에러가 발생한다면 intellij version 확인이 시급...

### 코틀린 파일 생성 방법

controller, service, repository와 같이 다른 class 파일을 참조할 때에는  
class 파일명(private var test : Test)

service, implements와 같은 형식의 경우   
class 파일명() : implements 파일명 {} 형식으로 사용

나는 주로 패키지 구조를 controller, service, repository 구조로 패키징을 하였는데  
회사에서 처음으로 DDD 구조를 적용해서 패키징 구조를 다른걸 사용하는 것을 보았다

- Presentation ( controller )
- Application ( service )
- Domain ( model )
- Infrastructure ( repository )

해당 구조를 사용해서 프로젝트를 만드는 것이 최근 트렌드 방향이라는 것 같길래.....
지금 만든 패키징 구조를 유지하며, 새로운 구조를 적용시킨 것을 만들어서 비교해볼 예정...

=> 기존에 만들었던 파일은 v1 패키지 안으로 이동