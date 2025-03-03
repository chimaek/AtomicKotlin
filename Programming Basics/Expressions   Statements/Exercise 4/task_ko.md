## IDE 마스터하기: 디버그

디버깅은 코드에서 어떤 일이 발생하고 있는지 확인할 수 있는 강력한 방법입니다. 프로그램의 중간 상태와 이러한 상태 간의 변화를 관찰할 수 있습니다.

`main()` 함수 옆에 있는 아이콘을 클릭하고 
<span class="control">`Debug`</span>를 선택하세요. 
특별한 바로 가기가 있다는 것을 확인하세요: 
<span class="shortcut">&shortcut:DebugClass;</span>.
아직 실행이 중단될 포인트를 설정하지 않았기 때문에 프로그램은 단순히 실행되어 결과를 표시합니다.

변수의 상태를 관찰하기 위해 실행을 중단하고자 하는 지점을 *브레이크포인트*라고 합니다. 에디터에서 줄 브레이크포인트를 생성하려면, 먼저 소스 코드의 원하는 줄에 커서를 놓으세요. 그런 다음 다음 중 하나를 수행하세요:

- 브레이크포인트를 전환하고자 하는 줄의 좌측 여백 영역을 클릭하세요.

- 메인 메뉴에서 <span class="control">`Run | Toggle Line Breakpoint`</span>를 선택하세요.

- <span class="shortcut">&shortcut:ToggleLineBreakpoint;</span>를 누르세요.

6번 줄과 7번 줄에 브레이크포인트를 설정하세요:

```kotlin
x = 2
println(x)
```

그런 다음 프로그램을 다시 디버깅을 시작하고 첫 번째 브레이크포인트에서 멈추는 것을 확인하세요.
화면 아래의 디버그 창은 모든 변수들의 값을 보여줍니다. 
디버그 창 왼쪽에서 <span class="control">`Resume program`</span>을 클릭하거나 
<span class="shortcut">&shortcut:Resume;</span>을 눌러 프로세스를 진행하세요.
대입이 이루어진 후 변수 `x`의 값이 어떻게 변하는지 확인하세요.

디버깅을 멈추려면 프로그램 실행을 완료하여 결과를 확인하거나 명시적으로 중단할 수 있습니다. <span class="control">`Stop`</span> 버튼을 눌러 디버깅 과정을 중단하세요.