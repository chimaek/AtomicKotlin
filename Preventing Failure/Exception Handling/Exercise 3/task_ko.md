## 예외 처리 (#3)

시작 코드에는 `DataBase` 클래스와 관련된 예외들, 그리고 `NetConnection` 클래스와 관련된 예외들이 포함되어 있습니다. 또한 예외의 대안으로 `Success`와 `Failed`를 보고하는 `Status` 열거형도 있습니다.

여러분의 목표는 `DataBase`와 두 개의 `NetConnection`을 참조하는 `transact()` 함수를 완성하는 것입니다. 시작 코드에서는 `DataBase`를 여는 방법을 보여줍니다.

내부 함수 `transfer(net: NetConnection): Status`에서는 `net`을 열고, `net`에서 데이터를 읽고, 그 결과를 `DataBase`에 쓰는 코드를 작성해야 합니다. 또한 예외를 포착하고 어떤 예외가 발생하더라도 `Failed`를 반환해야 합니다. `transfer()`의 마지막 부분에서는 `finally` 절이 `net`을 닫고 이와 관련된 예외를 처리합니다. `transfer()`를 성공적으로 완료하면 `Success`가 반환됩니다.

`transact()`의 나머지 부분은 각 `NetConnection` 객체에 대해 `transfer()`를 호출하여 결과를 확인하고, `transfer()`가 `Failed`를 반환하면 `transact()`도 `Failed`를 반환합니다. 마지막으로, `finally` 절에서 `DataBase` 객체를 닫으려고 시도합니다.

`DataBase`와 `NetConnection`의 많은 멤버 함수는 `id: Int`와 `level: Int`라는 매개변수를 받습니다. `id`는 각 호출마다 다른 숫자이며, `transact()`는 `level` 매개변수를 받아 각 호출에 전달합니다. 멤버 함수 정의에서 `id`가 `level`과 비교되어 예외를 발생시킬지 결정합니다. 이렇게 하면, `main()`의 시작 코드에서 서로 다른 `level` 값을 전달함으로써 모든 예외 가능성이 하나씩 테스트됩니다.

작업이 예외를 발생시키는지, *그리고* 그 예외를 복구할 수 있는지 여부를 고려해야 합니다. 예를 들어, `transact()` 내에서 데이터베이스 열기에 실패했다면 데이터를 잃은 것이 아니므로 단순히 `Failed`를 반환하고 프로그램이 다시 시도할 수 있습니다. 하지만 데이터베이스 닫기에 실패했다면 데이터베이스 상태를 알 수 없다는 의미이므로 `Failed`를 반환하기보다는 예외를 던지는 것이 더 적절할 것입니다. 반대로, 네트워크 연결을 닫을 때 실패한다면 이는 특히 문제가 되지 않습니다.

다시 말하지만, 모든 가능한 실패로부터 복구를 시도할 때 얼마나 빠르게 복잡해질 수 있는지 주목하세요.

<sub> 이 작업에는 자동 테스트가 포함되어 있지 않으므로 "Check"를 실행하면 항상 "Correct"로 표시됩니다. 여러분의 솔루션을 제공된 솔루션과 비교해보세요! </sub>