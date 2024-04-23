package com.example.kotlin

class Variable {

    //타입을 명시하지 않아도 컴파일러가 타입을 추론한다.
    val question = "sample question" //-> String
    val num = 42 //-> Int
    val yearsToCompute = 7.5e6 //-> Double

    //변수의 타입을 직접 명시해줄 수도 있다.
    val answer: Int = 42

    //변경, 재할당이 가능한 변수
    //한번 타입이 추론되면 다른 곳에서 어싸인할때 다른 타입으로 못넣음.
    var variable = 1

    /**
     * val 키워드지만, 컴파일러가 오직 하나의 초기화 문장만
     * 실행됨이 확실하면 여러 곳에서 할당하는 코드가 들어갈 수 있다.
     */
    fun variableExam(b: Boolean): String {
        val message: String

        if (b) {
            message = "true"
        } else {
            message = "false"
        }

        return message
    }

    /**
     * 타입이 생략가능하다지만, 다른 타입을 재할당 할 수는 없다.
     */
    var intValue = 1
//    intValue = "123" //-> 컴파일에러
}