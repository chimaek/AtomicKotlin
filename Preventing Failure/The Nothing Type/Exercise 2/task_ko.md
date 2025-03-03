## `Nothing` 타입 (#2)

Exercise 1을 수정하여 `messages`라는 이름의 `String`들을 담는 가변 `List`를 포함하고, 다음 두 가지 함수를 가지는 `object Log`를 만드세요. 이 `List`는 `private`으로 설정됩니다.

- `add(msg: String)`: `msg`를 `messages`에 추가합니다.

- `report()`: 수정할 수 없는 `messages`의 복사본을 반환합니다.

`fail()`에서 `Failure`를 던지기 전에 `Log`에 `msg`를 추가하세요.  
`main()`에 있는 시작 코드는 여러분의 작업을 테스트합니다.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로,
"Check"를 실행하면 항상 "Correct"로 표시됩니다.  
제공된 솔루션과 여러분의 솔루션을 비교해 보세요! </sub>