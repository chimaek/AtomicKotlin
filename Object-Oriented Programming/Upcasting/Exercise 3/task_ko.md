## 업캐스팅 (#3)

인터페이스를 결합하여 클래스를 생성할 때, 해당 클래스의 객체를 각각의 다른 인터페이스로 업캐스트할 수 있습니다.

시작 코드에는 세 개의 인터페이스가 포함되어 있습니다: `Fighter`는 `fight()` 함수를 가지고 있고, `Swimmer`는 `swim()` 함수를 가지고 있으며, `Flyer`는 `fly()` 함수를 가지고 있습니다. 그리고 `fight()` 함수가 `"ActionCharacter fight"`를 반환하는 클래스 `ActionCharacter`가 있습니다.

`Hero` 클래스를 정의하여 `ActionCharacter`, `Fighter`, `Swimmer` 및 `Flyer`를 결합하세요. `ActionCharacter`의 `fight()`가 `Fighter` 인터페이스에 필요한 `fight()` 구현을 제공한다는 점에 주목하세요. `swim()`은 `"Hero swim"`을 반환하고, `fly()`는 `"Hero fly"`를 반환하도록 정의하세요.

다음으로, `tryFight(x: Fighter)`, `trySwim(x: Swimmer)`, `tryFly(x: Flyer)`, `doAction(x: ActionCharacter)`를 구현하여 각 함수가 해당 매개변수를 통해 사용할 수 있는 멤버 함수를 호출하고 결과를 출력하도록 하세요.

`main()`에서는 `Hero` 객체를 생성하고 이를 각각의 함수 `tryFight()`, `trySwim()`, `tryFly()`, `doAction()`에 전달하세요. `main()`을 실행하여 출력을 확인하세요. `Hero`를 각 함수에 전달할 때, 해당 함수 내부에서 `Hero`가 고유한 타입을 잃고 매개변수의 타입으로 업캐스트된다는 점에 주목하세요.