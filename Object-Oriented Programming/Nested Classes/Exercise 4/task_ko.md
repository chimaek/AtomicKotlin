## 중첩 클래스 (#4)

`Ticket.kt`에서 *상태* 패턴의 구현을 개선하세요. `Seat`을 열거형에서 비중첩 `추상 클래스`로 변경하고, 각 `Seat` 타입에 대한 중첩 서브클래스를 만드세요. `Seat`은 `upgrade()`와 `meal()`에 대한 `추상` 멤버 함수들을 포함합니다. 또한, 구체 서브클래스의 `simpleName`을 반환하는 `toString()`도 존재합니다.

`Ticket`은 이제 `Seat` 객체를 보유하는 단순한 보조 역할을 하며, `upgrade()`와 `meal()` 함수는 이들의 동작을 `Seat` 객체에 위임합니다.

추가 과제 (도전): 왜 `Ticket`에서 `seat`에 대해 위임을 사용할 수 없는지 설명해 보세요.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "확인"을 실행할 때 항상 "정답"으로 표시됩니다. 제공된 솔루션과 비교해 보세요! </sub>