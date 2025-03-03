## 중첩 클래스 (#1)

`FillIt.kt`에서, `State`는 `grid`에 더 이상 `Blank` 공간이 없을 때를 확인하는 데만 사용됩니다. `State`를 제거하고 `turn()`에서 `Boolean` 값을 반환하도록 프로그램을 단순화하세요. 작동하도록 수정한 후, `enum class Mark { Blank, X, O }`를 `enum class Mark { Blank, X, Y, Z }`로 변경하여 세 번째 플레이어를 추가하세요. `turn()`에서는 `when` 표현식을 사용하여 다음 `player` 값을 설정하세요.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "Check"를 실행할 때 항상 "Correct"로 표시됩니다. 제공된 솔루션과 본인의 솔루션을 비교해 보세요! </sub>