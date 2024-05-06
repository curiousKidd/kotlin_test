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
