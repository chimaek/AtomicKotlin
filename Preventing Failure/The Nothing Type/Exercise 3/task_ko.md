## `Nothing` 타입 (#3)

`Failure`와 `fail()`을 이전 두 연습 문제와 동일하게 생성하되, `fail()`에서는 `trace()`를 호출하지 마세요. 파일 스코프에서 `private var _debug`를 추가하고, 이를 `true`로 초기화하세요. `fun debug(test: Boolean)`을 정의하여 항상 `trace()`를 호출해서 호출되었는지를 확인하도록 하세요 (`trace()` 메시지 형식은 `main()`에 제공된 시작 코드를 참조하세요). 그러나 `_debug`가 `true`일 때만 `debug()` 활동을 수행합니다. `main()`에 있는 시작 코드는 여러분의 작업물을 테스트합니다.

<sub> 이 작업은 자동 테스트를 포함하지 않으므로, "Check"를 실행할 때 항상 "Correct"로 표시됩니다. 제공된 솔루션과 여러분의 솔루션을 비교해 보세요! </sub>