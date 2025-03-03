## 단위 테스트 (#3)

`ClassDelegation/SpaceShipControls.kt`에 있는 `SpaceShipControls` 클래스를 테스트하세요.  
각 테스트에 대해 속도를 10으로 설정하세요. 테스트 객체가 새로 생성될 때마다 "init"을 출력하여 각 테스트마다 새로운 테스트 객체가 생성되는지 확인하세요.

`kotlin.test`의 `assertEquals()`를 직접 호출하는 대신, 파일 범위에 다음과 같은 제네릭 함수를 추가하세요:

```kotlin
infix fun <T> T.aeq(actual: T) = assertEquals(this, actual)
```

`aeq`를 사용하는 방법: *기대값* `aeq` *실제값*.

<sub> 이 과제는 자동 테스트가 포함되어 있지 않으므로 "검사"를 실행할 때 항상 "정답"으로 표시됩니다.  
제공된 솔루션과 귀하의 해답을 비교해 보세요! </sub>