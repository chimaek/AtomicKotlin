## 상속 (#1)

초기 코드에는 `open` 클래스 `Cleanser`와 이를 상속하는 클래스 `Detergent`가 포함되어 있습니다. `Cleanser` 클래스에 속성 `var ops: MutableList<String>`와 함수 `dilute()`, `apply()`, `scrub()`를 추가하세요. 이 함수들은 단순히 자신의 이름을 `ops`에 추가하기만 하면 됩니다. `main`에서 이제 `Detergent`가 `Cleanser`와 동일한 함수를 가지는지 확인하세요.