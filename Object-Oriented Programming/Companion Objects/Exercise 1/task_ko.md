## 동반 객체 (#1)

`CompanionFactory.kt`에서 보여준 *Factory* 아이디어는 여러 팩토리를 도입하면 더욱 흥미로워집니다. 동일한 구성으로 다양한 유형의 객체를 쉽게 생성할 수 있기 때문입니다.

두 개의 인터페이스로 시작합니다:

```kotlin
interface Vendor {
  fun pencil()
  fun pen()
}

interface VendorFactory {
  fun create(): Vendor
}
```

`Vendor`를 구현하는 `Vendor1`과 `Vendor2`를 만드세요. 멤버 함수는 `trace()`를 사용하여 `Vendor` 클래스 이름과 "pencil" 또는 "pen"을 보고합니다. 각 `Vendor` 구현체에는 또한 `VendorFactory`를 구현하는 익명 내부 클래스를 포함하는 `factory` 속성을 가진 동반 객체가 있습니다.

이제 `consumer(factory: VendorFactory)`라는 독립형 함수를 작성하세요. 이 함수는 `factory`를 사용하여 `Vendor`를 생성합니다. 생성된 `Vendor`를 사용하여 `pencil()`과 `pen()`을 호출합니다. `main()`의 시작 코드가 당신의 솔루션을 검증할 것입니다.

<sub> 이 과제는 자동 테스트를 포함하지 않습니다.  
"Check"를 실행할 때 항상 "Correct"로 표시됩니다.  
제공된 솔루션과 당신의 솔루션을 비교해 보세요! </sub>