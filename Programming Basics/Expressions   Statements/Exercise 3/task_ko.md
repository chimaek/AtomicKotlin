## 표현식과 문장 (#3)

다음 코드가 무엇을 출력할지 예상한 후 Kotlin을 사용하여 직접 확인해 보세요:

```kotlin
var i = 1
println(i-- - --i)
```

IntelliJ IDEA에서 힌트를 열어 설명을 확인하세요.

<div class="hint">

이 코드는 다음과 같이 다시 작성할 수 있습니다:

```kotlin
// i--의 의미:
// 먼저 현재 값이 사용되고,
// 그 후에 값이 감소됩니다.
val left = i // i: 1, left: 1
i -= 1 // i: 0

// --i의 의미:
// 먼저 값이 감소되고,
// 그 후에 현재 값이 사용됩니다.
i -= 1 // i: -1
val right = i // i: -1, right: -1

val result =
  left - right // 1 - (-1) = 1 + 1 = 2
println(result)
```

</div>