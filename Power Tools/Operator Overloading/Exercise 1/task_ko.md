## 연산자 오버로딩 (#1)

다음과 같이 시작하는 클래스를 작성하세요:

```kotlin
class WrapRange(
  val range: IntRange,
  private var current: Int = range.start
) {
```

`WrapRange` 객체를 증가시키거나 감소시킬 수 있도록 멤버 함수를 작성하되, `current`가 자동으로 `range` 내에 유지되도록 하세요.

`main()`에 있는 시작 코드를 수정하여 주어진 연습 문제의 결과가 나타나도록 필요한 변경 사항을 적용하세요.

<sub> 이 과제에는 자동 테스트가 포함되어 있지 않으므로, "검사"를 실행할 때 항상 "정답"으로 표시됩니다. 제공된 솔루션과 본인의 솔루션을 비교해 보세요! </sub>