## IDE 숙련하기: 속성 추출

이전 과제의 코드에서 상수 `100`을 몇 번 사용했습니까? 상수를 `val`에 배치하면 변경하기가 더 쉽습니다. 만약 필드 크기가 `1000 x 1000`으로 변경되야 한다면, 여러 곳에서 상수를 변경하는 것은 오류를 일으킬 가능성이 높습니다. 한 곳에서만 변경하고 다른 곳에서 변경을 놓친다면, 찾기 어려운 버그를 초래할 수 있습니다.

코드의 여러 곳에서 동일한 상수가 나타날 때는 속성으로 추출하는 것이 현명합니다. IntelliJ IDEA는 이를 자동으로 수행할 수 있는 기능을 제공합니다. 코드 샘플에서 상수 `10`을 선택한 후, <span class="control">`속성 추출(Extract Property)`</span> 액션을 호출하세요. <span class="shortcut">&shortcut:IntroduceField;</span> 바로가기를 사용하거나, 메인 메뉴의 <span class="control">`리팩터 | 추출 | 속성(Refactor | Extract | Property)`</span>를 선택할 수도 있습니다.

열린 메뉴에서 타겟 코드 블록으로 `Counter`를 선택하고, <span class="control">`모든 발생 위치 교체(2)(Replace all occurrences(2))`</span> 옵션이 선택된 것을 확인한 뒤, `Enter` 키를 누릅니다. 그러면 해당 상수가 이제 속성으로 선언된 것을 확인할 수 있으며, 멤버 함수에서 참조하고 있습니다. 속성은 `private` 한정자로 선언되며, 이는 이후 원자(atom) 단위 강의 중 하나에서 다룰 예정입니다.