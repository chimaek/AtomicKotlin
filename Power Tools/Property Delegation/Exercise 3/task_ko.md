## 속성 위임 (#3)

다음과 같이 시작하는 제너릭 클래스를 생성하세요:

```kotlin
class Holder<E> {
  private var list = listOf<E>()
```

`Holder`에 대해 `getValue()`와 `setValue()`를 정의하여, 다음과 같은 코드를 성공적으로 작성할 수 있도록 하세요:

```kotlin
class Holders {
  var strings by Holder<String>()
  var ints by Holder<Int>()
  var bools by Holder<Boolean>()
}
```

`main()`에 있는 초기 코드가 당신의 솔루션을 테스트합니다.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "검증하기(Check)"를 실행할 때 항상 "정답(Correct)"으로 표시됩니다.
제공된 솔루션과 본인의 솔루션을 비교해보세요! </sub>