## IDE 활용 마스터하기: 선택 확장

<span class="control">`Extract Property`</span>와 같은 리팩토링을 적용할 때, 추출하고자 하는 표현식을 선택해야 합니다. 이 표현식은 꽤 복잡할 수 있습니다.

<span class="control">`Extend Selection`</span> 기능은 <span class="shortcut">&shortcut:EditorSelectWord;</span> 단축키를 사용해 접근할 수 있으며, 이 경우 매우 유용합니다. 이 기능은 외부 표현식을 선택하며, 각 단계마다 선택 범위를 확장합니다. 반대 기능은 <span class="control">`Shrink selection`</span>이라고 하며, <span class="shortcut">&shortcut:EditorUnSelectWord;</span>를 통해 사용할 수 있습니다.

커서를 `println("Incorrect input: $x should be positive")`라는 줄에 놓고, 선택을 확장하거나 축소하는 작업을 통해 이 기능이 어떻게 작동하는지 확인하십시오. 선택을 계속 확장하여 파일 전체가 선택될 때까지 진행하세요.