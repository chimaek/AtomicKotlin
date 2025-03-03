## Non-Null Assertions (#2)

`List<Int>.headPlusTail()`이라는 확장 함수를 정의하여 `Triple`을 반환합니다. 여기에는 (1) `List<Int>`의 첫 번째 요소, (2) `List<Int>`의 마지막 요소, (3) 첫 번째와 마지막 요소의 합이 포함됩니다. 만약 `List<Int>`가 비어 있으면, `Triple`의 세 항목 모두 `null`을 반환합니다. `List<Int>`가 하나의 요소만으로 이루어져 있다면, 첫 번째 항목으로 해당 요소를 반환하고, 두 번째로 `null`, 세 번째로도 동일한 요소를 결과로 반환합니다.

`main()`에서 `ints`라는 이름의 `mutableListOf<Int>`를 생성합니다. 그런 다음 `trace(ints.headPlusTail())`를 호출합니다. 그 후, `-2..10` 범위를 두 개씩 건너뛰며 반복하는 `for` 루프를 만듭니다. 루프에서는 `ints.add(n)`을 호출하고, `trace(ints.headPlusTail())`을 호출한 뒤, 마지막으로 `ints.headPlusTail()` 호출 결과를 non-null assertion을 사용하여 선택합니다.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로, "Check"를 실행하면 항상 "Correct"로 표시됩니다. 제공된 솔루션과 본인의 솔루션을 비교해 보세요! </sub>