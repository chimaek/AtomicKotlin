## 가시성 제한 (#1)

`public val name`과 `public val species` 속성을 초기화하는 생성자가 있는 `Alien` 클래스를 만드세요. 생성자에 의해 초기화되는 `private var planet` 속성을 추가하세요. `planet`은 `movePlanet()` 멤버 함수를 사용하여 수정할 수 있습니다. `movePlanet()`은 `Alien`이 *이동할* 행성을 매개변수로 받습니다. 모든 속성과 매개변수는 `String` 타입입니다. `toString()`을 재정의하여 `"Alien $name, $species: $planet"` 형식으로 `name`, `species`, `planet`을 반환하도록 만드세요.

`main()`에서 두 개의 `Alien` 객체를 생성하고 원래 `planet`에서 목적지 `planet`으로 이동시키며, `toString()`과 데이터를 사용하여 테스트하세요:

| `name`    | `species`  | Origin      | Destination |
|-----------|------------|-------------|-------------|
| Arthricia | Cat Person | PurgePlanet | Earth C-137 |
| Dale      | Giant      | Gearworld   | Parblesnops |

`val` 속성은 `public` 속성으로 직접 접근해도 안전하며, `private`으로 만들 필요가 없다는 점에 유의하세요.