## 고차 함수 (#2)

다음 함수를 `mapNotNull()`의 단일 호출로 다시 작성하세요:

```kotlin
fun List<Int>.transform(): List<Int> =
  filter { it % 2 == 0 }.map { it * it }