## 제네릭 생성하기 (#2)

제네릭 클래스 `CrateList`를 생성하고, 이를 `Crate`의 `ArrayList`로부터 상속받도록 합니다.  
`Crate`는 `toString()` 메서드를 가지고 있지 않습니다. 이 문제를 해결하기 위해,  
제네릭 `contents` 인수를 받고 `Crate`를 상속받는 `private` 중첩 클래스  
`DecoratedCrate`를 만드세요. `DecoratedCrate`에 `toString()` 메서드를 추가하여  
`get()`을 호출한 결과를 대괄호로 감싼 `String`을 반환하도록 합니다.

제네릭 `item` 인수를 받아, 그 인수로 `DecoratedCrate`를 생성하고 그 결과를  
`ArrayList`에 추가하는 멤버 함수 `add()`를 정의하세요.  
`main()`의 코드가 여러분의 솔루션을 테스트합니다.

<sub> 이 과제는 자동 채점 테스트를 포함하지 않으므로  
"Check"를 실행했을 때 항상 "Correct"로 표시됩니다.  
여러분의 솔루션을 제공된 예제와 비교해 보세요! </sub>