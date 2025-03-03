## 스코프 함수 (#2)

시작 코드에서는 `ClassDelegation/SpaceShipControls.kt`의 
`SpaceShipControls` 클래스를 사용합니다. 이 코드는 다음으로 시작하는 `main()`을 포함하고 있습니다:

```kotlin
fun main() {
  var velocity = 1
  with(SpaceShipControls()) {
    trace(forward(velocity))
```

`right(velocity)` 및 `down(velocity)` 호출을 추가하고 각각의 결과를 추적하세요. 스코프 함수의 닫는 `}`에서 결과를 `let` 블록으로 체인한 뒤, `velocity`를 증가시키고 동일한 작업을 수행합니다. 해당 블록의 끝에서 `run` 블록, 그다음에는 `apply` 블록, 마지막으로 `also` 블록으로 체인하여 각각 동일한 작업을 수행합니다. 이상이 없는지 확인하려면 `trace`를 사용하여 출력 결과를 검증하세요.

<sub> 이 작업은 자동 테스트를 포함하지 않으므로 "검사"를 실행할 때 항상 "정답"으로 표시됩니다.
제공된 솔루션과 당신의 솔루션을 비교해보세요! </sub>