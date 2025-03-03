## 프로퍼티 위임 도구 (#3)

`observe()`라는 제네릭 함수(generic function)를 생성하여, 프로퍼티가 변경될 때마다 `"$propertyName $oldValue to $newValue"`를 캡처하는 `trace()`를 사용하세요. 다음과 같이 작동하는지 확인하세요:

```kotlin
class Product(nm: String = "<0>", id: Int = -1) {
  var name by observable(nm, ::observe)
  var ident by observable(id, ::observe)
  override fun toString() = "$name $ident"
}
```

그리고 `main()`에 있는 시작 코드(starter code)가 성공적으로 실행되는지 확인하세요.

<sub> 이 작업에는 자동 테스트가 포함되어 있지 않으므로,
"Check"를 실행할 때 항상 "Correct"로 표시됩니다.
제공된 솔루션과 여러분의 솔루션을 비교하세요! </sub>