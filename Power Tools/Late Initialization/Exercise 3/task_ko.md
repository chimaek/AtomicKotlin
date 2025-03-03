## 지연 초기화 (#3)

시작 코드에서는 다음을 제공합니다:

```kotlin
data class Generator(val id: Int)

class Turbine(val id: Int) {
  private lateinit var _generator: Generator
  val generator: Generator
...
```

`generator`에 대한 `get()`을 추가하여 `_generator`가 초기화되었는지 확인하고, 초기화되지 않았다면 `_generator`를 초기화한 후 반환하도록 합니다. 또한, `toString()`을 추가하여 "Generator $id running: "로 시작하고, 생성기가 실행 중인지 여부를 나타내도록 합니다.

시작 코드에서는 다음을 제공합니다:

```kotlin
class PowerPlant(nTurbines: Int = 4) {
  private val turbines: List<Turbine> =
...
```

`turbines`의 초기화를 완료한 다음, `fun generator(number: Int): Generator`를 추가하여 `number`가 범위 내에 있는지 확인한 후 원하는 생성기를 반환하도록 합니다. 마지막으로, `PowerPlant`의 각 생성기의 상태를 표시하기 위해 `forEach`를 사용하는 `status()` 멤버 함수를 추가합니다. `main()`의 코드는 솔루션을 테스트합니다.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "Check"를 실행할 때 항상 "Correct"로 표시됩니다. 제공된 솔루션과 자신의 솔루션을 비교해 보세요! </sub>