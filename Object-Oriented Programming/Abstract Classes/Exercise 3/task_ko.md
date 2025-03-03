## 추상 클래스 (#3)

시작 코드에는 `abstract` 클래스 `Instrument`가 포함되어 있으며, 이 클래스는 `abstract` 멤버 함수 `play(n: Note)`를 포함합니다. `Note`는 값이 `A`부터 `G`까지인 `enum`으로 정의되어 있습니다.

`Wind`, `Percussion`, `Stringed` 클래스는 모두 `Instrument`를 상속받으며, 각각의 경우 `play()`를 재정의하여 클래스 이름을 포함한 `String`을 반환합니다. 그런 다음 `Wind`의 경우 `blow`, `Percussion`의 경우 `strike`, `Stringed`의 경우 `pluck`, 마지막으로 연주되는 `Note`를 반환합니다.

`Instrument`에 두 개의 생성자 인수 `name`과 `action`을 추가하고, 하위 클래스에서 해당 값을 전달하십시오. `name`과 `action`을 `val` 속성으로 만들고, 상위 클래스에서 `play()`의 구현을 제공하여 이전에 각 하위 클래스의 `play()`에서 생성된 동일한 값을 반환하도록 하십시오. 하위 클래스에서 `play()` 구현을 제거하십시오.