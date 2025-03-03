## 속성 위임 (#2)

다음을 사용하여 시작하세요:

```kotlin
class Delegator {
  private var list = List(8) { "$it" }
  var strings by list
}
```

`List<String>`에 대한 확장 함수로 `getValue()`와 `setValue()`를 정의하세요  
(힌트: IntelliJ IDEA가 스켈레톤 코드를 생성해줍니다). `main()` 코드에서  
당신의 해결 방법을 테스트합니다.

보너스: 아래와 같이 `getValue()`와 `setValue()`를 조정하여 작동하도록 시도해 보세요:

```kotlin
class Delegator {
  var strings by List(8) { "$it" }
  ...
```

그런 다음 어떤 일이 일어나는지 설명하세요.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로,  
"확인"을 실행할 때 항상 "Correct"로 표시됩니다.  
제공된 해결 방법과 비교해 보세요! </sub>