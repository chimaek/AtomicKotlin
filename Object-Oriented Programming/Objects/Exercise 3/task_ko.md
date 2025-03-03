## 객체 (#3)

다음으로 시작합니다:

```kotlin
interface AdventureGame {
  interface Environment
  interface Character
  val environment: Environment
  val characters: MutableList<Character>
  fun populate()
}
```

`Jungle`라는 `Environment`의 역할을 하는 클래스를 정의하고, 각각 `Character`인 `Monkey`와 `Snake` 클래스를 만드세요. 각 클래스 내에 `create()` 함수를 포함한 `object Factory`를 배치하세요. `Monkey`와 `Snake`는 자신들의 클래스 이름을 반환하는 `toString()`을 제공해야 합니다.

이제 다양한 `create()` 함수를 사용하여 초기화하는 `AdventureGame`인 `object MonkeysVsSnakes`를 정의하세요. `populate()`는 단지 `Monkey`와 `Snake`를 각각 하나씩 추가하면 됩니다. 미리 정의된 `main()`이 여러분의 코드를 테스트할 것입니다.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "Check"를 실행할 때 항상 "Correct"로 표시됩니다. 제공된 솔루션과 여러분의 솔루션을 비교해보세요! </sub>