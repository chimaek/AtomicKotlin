## 로깅 (#1)

시작 코드에는 [Check Instructions]의 연습문제 3 해결책인 `class Level`이 포함되어 있습니다.

`Pipe`라는 클래스를 생성하고, 생성자 매개변수로 `val level: Level`을 받게 합니다. 이 매개변수의 기본 인수로 범위 `0..10`을 설정하세요.

`Pipe` 내부에서, 관련 파일 `"PipeLog.txt"`와 함께 `atomiclog`를 사용하여 `val logger`를 정의하세요. `checkLevel()`이라는 멤버 함수를 생성하며, 이 함수는 `when` 표현식을 사용합니다. `value`가 다음과 같을 때:

- 2: `trace()` 호출
- 4: `debug()` 호출
- 6: `info()` 호출
- 8: `warn()` 호출
- 10: `error()` 호출

각 호출에 대한 로그 메시지는 단순히 "Level " 뒤에 해당 값을 추가한 형태입니다. `main()`의 시작 코드는 여러분의 솔루션을 테스트합니다.

<sub> 이 작업에는 자동 테스트가 포함되어 있지 않으므로, "Check"를 실행하면 항상 "Correct"로 표시됩니다. 여러분의 솔루션을 제공된 예제와 비교해보세요! </sub>