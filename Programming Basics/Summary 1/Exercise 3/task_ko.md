## 요약 1 (#3)

`if`로 시작하는 *표현식 본문*을 가지는 함수 `first()`를 작성하세요.  
이 함수는 세 개의 `Boolean` 매개변수를 받고, 이들을 "그리고(and)"로 결합하여 결과를 만듭니다.  
같은 방식으로 동작하지만 세 매개변수를 모두 "또는(or)"으로 결합하는 `second()` 함수를 작성하세요.  
`main()`에서 `first()`와 `second()`의 결과를 "그리고(and)"와 "또는(or)"을 각각 사용하여 결합하고 그 결과를 출력하세요:

| `first()` 인자       | `second()` 인자       |
|---------------------|----------------------|
| true, true, true    | false, false, false  |
| true, false, true   | false, true, false   |