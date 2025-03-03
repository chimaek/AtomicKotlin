## sealed 클래스 (#1)

`SealedClasses.kt`를 수정하세요. 먼저 `Bus` 클래스에 있는 `capacity` 속성을 `Transport` 클래스에 옮기고, `travel()`의 `when` 표현식 다음에 `trace("size ${transport.capacity}")`를 추가하세요. 그런 다음 새로운 서브클래스를 추가하세요:

- `Tram`, `val route: String`을 포함
- `Plane`, `val flightNumber: String`을 포함

이 새로운 서브클래스를 수용하도록 `travel()`를 수정하세요. `main()`의 `List`에 `Tram`과 `Plane`을 추가하세요.