## IDE 숙달하기: Change signature

함수 매개변수 이름을 안전하게 변경할 수 없는 이유는 호출자가 이 매개변수 이름을 지정할 수 있고, 이름이 변경되면 그들의 코드가 더 이상 컴파일되지 않기 때문입니다. IntelliJ IDEA는 이를 자동으로 수정할 수 있습니다. 단축키 <span class="shortcut">&shortcut:ChangeSignature;</span>를 사용하거나 <span class="control">`Refactor | Change Signature`</span>를 선택하세요. 매개변수 이름을 변경하거나 함수에 매개변수를 추가할 수 있으며, 모든 호출자가 이에 맞게 업데이트됩니다.

`foo()`에 커서를 놓고 <span class="control">`Change Signature`</span> 리팩토링을 선택하세요. `+` 기호가 있는 아이콘을 눌러 매개변수를 하나 더 추가합니다. 매개변수 이름은 `d`, 타입은 `Double`로 설정하고 기본값은 `1.0`으로 지정합니다. <span class="control">`Enter`</span>를 누르거나 <span class="control">`Refactor`</span> 버튼을 클릭하세요. 호출자가 어떻게 변경되는지 주목하세요: 이제 모든 호출자에 대해 기본값이 사용됩니다. 동일한 매개변수를 `bar()`에 추가하되 기본값은 지정하지 않습니다.