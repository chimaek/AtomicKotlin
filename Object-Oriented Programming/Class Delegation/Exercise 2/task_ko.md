## 클래스 위임 (#2)

[상속 & 확장]의 연습문제 1에서는 `Crocodile`을 구성하여 `interactWithDuck()`과 함께 작동하도록 조정합니다. 그러나 `CrocoDuck`을 `interactWithCrocodile()` 함수와 함께 사용할 때 불일치가 발생합니다—구성된 `crocodile`을 호출 시 명시적으로 지정해야 합니다:

```kotlin
interactWithCrocodile(honestlyDuck.crocodile)
```

클래스 위임을 사용하여 해당 연습 문제의 해결책을 수정하고, `interactWithCrocodile(honestlyDuck)` 함수를 호출할 수 있도록 하십시오. `CrocoDuck`의 `crocodile` 매개변수를 `private`으로 설정하여 해당 속성을 노출할 수 *없도록* 만드십시오.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "Check"를 실행할 때 항상 "Correct"로 표시됩니다. 제공된 솔루션과 본인의 해답을 비교해 보세요! </sub>