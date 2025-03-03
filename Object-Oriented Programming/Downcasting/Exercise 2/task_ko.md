## 다운캐스팅 (#2)

`FindType.kt`를 수정하여 `filterIsInstance()`를 사용하세요. 먼저 모든 `Dog` 객체를 찾은 후, 결과로 나온 각 객체를 `bark()`에 매핑하고 `atomictest.eq`를 사용하여 결과를 테스트하세요. `filterIsInstance()`는 이미 다운캐스트된 `Dog` 객체들의 시퀀스를 생성한다는 점에 유의하세요.

`filterIsInstance()`의 두 번째, 더 동적인 형태는 *클래스 객체*를 매개변수로 받습니다. `Dog::class.java`를 `filterIsInstance()`의 인자로 전달하고, 나머지 표현식은 이전 문단에서 설명된 대로 작성하세요. 이 버전의 `filterIsInstance()`는 제네릭 인자를 사용하는 버전과 어떻게 다른가요?

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "Check"를 실행하면 항상 "Correct"로 표시됩니다.
제공된 해답과 여러분의 해답을 비교해보세요! </sub>