## Companion Objects (#2)

다음 두 개의 인터페이스로 시작합니다:

```kotlin
interface BoardGame {
  fun move(): Boolean
  companion object {
    fun createBoard() {
      trace("BoardGame.createBoard()")
    }
  }
}

interface GameFactory {
  fun create(): BoardGame
}
```

`BoardGame`를 상속받는 `Checkers`와 `Chess` 클래스 두 개를 만드세요. 두 클래스 모두 인자가 없는 `private` 생성자를 가져야 합니다. 각 클래스는 생성자에서 `createBoard()`를 호출하는 `companion object Factory: GameFactory`를 포함해야 합니다. 각 companion object는 `move()` 내에서 사용되는 `const val max`를 포함해야 합니다. `playGame()`과 `main()`의 정의가 제공되었습니다. `main()`의 테스트를 통과하도록 `Checkers`와 `Chess`에서 코드를 완성하세요.

<sub> 이 과제에는 자동 테스트가 포함되어 있지 않으므로, "Check"를 실행하면 항상 "Correct"로 표시됩니다. 여러분의 솔루션을 제공된 솔루션과 비교하시기 바랍니다! </sub>