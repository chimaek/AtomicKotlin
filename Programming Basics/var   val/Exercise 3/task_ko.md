## `var` 및 `val` (#3)

두 개의 `var`를 정의하세요: `x`와 `y`. 두 변수의 값을 서로 교환하세요. 먼저 `x = y`, `y = x`를 시도한 후, 잘못된 해결책을 수정하세요:

```kotlin
var x = 1
var y = 2
// 여기에서 값을 교환하세요
println(x) // 2
println(y) // 1
```

코드는 `var x = "first"`, `var y = "second"`과 같은 다른 초기값에 대해서도 동일하게 동작해야 합니다. 따라서, `x = 2`, `y = 1`을 사용하는 것은 기대하는 해결책이 아닙니다.

<div class="hint">

세 번째 보조 `val`을 도입해야 할 수도 있습니다.

</div>