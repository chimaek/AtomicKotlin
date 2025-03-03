## 내부 클래스 (#3)

`class Container<T>(iterable: Iterable<T>)`를 정의하고, 이 클래스에 `items`라는 `MutableList<T>` 속성을 추가하세요. `items`는 `iterable`을 데이터 소스로 사용하여 초기화되어야 합니다. `items`에 요소를 추가하는 `add(x: T)`라는 함수를 포함하세요. 또한, 다음을 구현하는 익명 내부 클래스를 반환하는 멤버 함수 `selector()`를 정의하세요:

```kotlin
interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}
```

- `end()`: 현재 `items` `List`의 끝에 도달했는지 여부를 반환합니다.

- `current()`: 현재 `Selector`가 가리키는 요소를 반환합니다.

- `next()`: `List`의 다음 요소로 이동합니다.

독립적으로 작동하는 `<T> traceAll(select: Selector<T>)` 함수를 정의하세요. 이 함수는 `select`를 사용하여 `current()`의 모든 값을 `trace`에 추가한 후, `trace`를 반환합니다.

그런 다음, `Container`를 `Iterable<T>`를 상속하도록 만들고, `Iterator<T>`를 상속받는 익명 내부 클래스의 인스턴스를 반환하는 `iterator()`라는 함수를 추가하세요. 그리고 `traceAll()`과 동일한 동작을 하는 `<T> traceAll2(ib: Iterable<T>)` 독립 함수를 추가하세요.

스타터 코드는 테스트를 실행하여 코드를 검증할 수 있는 `main()`을 포함하고 있습니다.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "확인"을 실행할 때 항상 "정답"으로 표시됩니다.
제공된 솔루션과 본인의 솔루션을 비교해보세요! </sub>