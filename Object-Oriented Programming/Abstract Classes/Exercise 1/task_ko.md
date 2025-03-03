## 추상 클래스 (#1)

`abstract class Shape`를 생성하고 두 개의 `abstract` 메서드 `draw()`와 `erase()`를 정의하며, 각각 기본 반환 유형인 (`Unit`)을 반환하도록 합니다. `Shape`를 상속받아 `Circle`, `Square`, `Triangle`을 생성하고, `abstract` 메서드를 재정의하여 `"Draw Circle"`, `"Erase Circle"` 등과 같은 인자를 가지고 `trace()`를 호출하도록 설정합니다. `main()`에서는 각각의 하위 클래스를 포함한 `List`인 `shapes`를 생성합니다. `List`에 있는 각 객체에 대해 `draw()`를 호출한 뒤, `erase()`를 호출하여 연습 문제의 출력과 맞게 구현합니다.