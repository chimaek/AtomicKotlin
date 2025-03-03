## 예외 처리 (#1)

`val name: String`이라는 생성자 매개변수를 가진 `Hamster`를 `data class`로 생성하세요.

이제 `Exception`을 상속받는 클래스 `HamsterCageException`을 만드세요.  
`HamsterCageException`은 생성자 매개변수 `val msg: String`을 받으며,  
`toString()`을 재정의하여 `"HamsterCageException: $msg"`를 생성하도록 하세요.  
`HamsterCageException`을 상속받는 세 가지 예외를 만드세요:

- `CageFullException(val limit: Int)`: `base-class` 생성자를 호출하며,  
  `"Cage full > $limit"`를 전달합니다.

- `NoSuchHamsterException(val id: String)`: `base-class` 생성자를 호출하며,  
  `"No Hamster $id"`를 전달합니다.

- `OutOfWaterException`: `base-class` 생성자를 호출하며,  
  `"Cage out of water"`를 전달합니다.

클래스 `HamsterCage(val capacity: Int)`를 만드세요.  
`HamsterCage`가 `capacity`에 도달했다면, 더 이상 다른 `Hamster`를 넣을 수 없습니다.

`HamsterCage`에서 `Hamsters`를 `HashSet`에 저장하세요.  
다음의 멤버 함수를 작성하세요:

- `add(h: Hamster)`는 케이지가 `capacity`에 도달한 경우 `CageFullException(capacity)`를 던집니다.

- `get(name: String)`은 해당 `name`의 `Hamster`를 찾을 수 없는 경우  
  `NoSuchHamsterException(name)`을 던집니다.

- `feed()`는 0에서 10 사이의 랜덤 숫자를 생성하며, 결과가 8보다 크면  
  `OutOfWaterException()`을 던집니다. 성공했다면, `"Feeding complete"`를 반환합니다.

시작 코드에는 초기화된 `Hamsters`의 `List`가 들어 있습니다.  
각 멤버 함수를 실행하는 함수를 작성하세요: `test(hc: HamsterCage)`.

- `add()`는 `hamsters`의 각 객체를 추가하려고 시도합니다.

- `get()`은 `hamsters`에서 첫 번째 `Hamster`의 `name`을 사용하고, 이후 `"Morty"`를 사용합니다.

- `feed()`를 세 번 호출합니다.

`test()`는 결과를 생성하는 작업에 대해 `trace()`를 호출합니다.  
잠재적인 예외를 잡아내고, 해당 예외에 대해 `trace()`를 호출하세요.

`main()`에는 `test()`에 `HamsterCage`를 전달하는 시작 코드와  
`trace`의 예상 출력 결과가 포함되어 있습니다.

작성된 코드의 복잡도를 고려하고, 어떤 예외를 일반적인 비예외 코드로 대체할 수 있는지 평가하세요.

<sub> 이 과제는 자동 테스트를 포함하지 않습니다.  
따라서 "Check"를 실행하면 항상 "Correct"로 표시됩니다.  
제공된 솔루션과 비교해 보세요! </sub>