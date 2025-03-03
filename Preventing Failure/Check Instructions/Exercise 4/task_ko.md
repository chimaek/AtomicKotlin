## 지침 확인 (#4)

`class Tank(val capacity: Double)`를 생성하세요. 여기서 `capacity`는 `Tank`가 담을 수 있는 최대 용량입니다. `Tank` 상단에 반드시 유지해야 하는 2%의 빈 공간을 계산하는 `safetyGap` 속성을 추가하세요. `Tank`의 현재 양은 읽기 전용 속성인 `level`에 저장됩니다. `Tank`가 실제로 담을 수 있는 허용량은 `maxLevel`입니다.

`Tank`를 위한 두 개의 멤버 함수를 정의하세요:

- `add(quantity: Double): Double` 함수에서는 `quantity`가 양수이어야 합니다. `quantity`의 충분한 양을 추가하여 `maxLevel`까지 채우고, 나머지는 `remainder`에 넣습니다. 함수의 마지막에 `level`이 0보다 크고, `level`이 `maxLevel`보다 작거나 같으며, `remainder`가 0 이상인지 확인하세요. 그런 다음 `remainder`를 반환합니다.

- `drain(quantity: Double)` 함수에서는 `quantity`가 양수이어야 하며, `Tank`의 `level`을 초과할 수 없습니다. `Tank`에서 `quantity`를 제거한 후, `level`이 0 이상인지 확인하세요.

`main()`에서 제공된 시작 코드는 여러분의 `Tank` 클래스와 에러 메시지를 `require()` 및 `check()` 호출에서 어떻게 사용하는지 테스트합니다.

`check()` 호출은 내부 함수의 논리가 올바르기만 하면 실패하지 않습니다. 즉, `check()`가 예외를 던진다면 그것은 프로그래밍 오류를 나타냅니다. 이로 인해, 코드가 검증된 후 성능 향상을 위해 `check()` 호출을 제거할 수 있습니다. 그러나 코드 검증을 유지하기 위해 이를 남겨두는 것이 가장 좋습니다. 만약 그것이 불가능하다면, `check()` 테스트를 단위 테스트로 전환할 수 있습니다 (자세한 내용은 [단위 테스트] 참고).

<sub> 이 작업에는 자동 테스트가 포함되지 않으므로 "Check"를 실행했을 때 항상 "Correct"로 표시됩니다. 제공된 솔루션과 여러분의 솔루션을 비교해 보세요! </sub>