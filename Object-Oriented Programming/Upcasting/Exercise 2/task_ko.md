## 업캐스팅 (#2)

업캐스팅은 파생 유형의 객체를 기본 유형을 보유한 컨테이너에 추가할 때도 발생합니다.

시작 코드에는 추상 멤버 함수 `consume()`을 포함하는 인터페이스 `Apple`이 포함되어 있습니다. `Apple`에서 `GrannySmith`, `Gala`, `Fuji` 및 `Braeburn`을 상속받으세요. `consume()`을 재정의하여 각각 `chomp GrannySmith`, `bite Gala`, `press Fuji` 및 `peel Braeburn`을 반환하도록 작성하세요.

`main()`에서는 `List<Apple>`을 생성하여 특정 `Apple` 유형으로 채웁니다. 각 객체에 대해 `consume()`을 적용하려면 `map()`을 사용하세요.