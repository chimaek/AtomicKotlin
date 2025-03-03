## IDE 마스터하기: 함수 추출

IntelliJ IDEA를 사용하면 반복되는 코드를 함수로 추출할 수 있습니다. 첫 번째 함수 본문에서 아래 코드를 선택하세요:

```text
if (x <= 0) {
    println("Incorrect input: $x should be positive")
    return
}
```

<span class="control">`Extract Function`</span> 작업을 입력하거나, <span class="shortcut">&shortcut:ExtractMethod;</span> 단축키를 사용하거나, 메인 메뉴에서 <span class="control">`Refactor | Extract | Function`</span>을 선택하세요. 새 함수 이름으로 `checkArgument`를 입력하고 <span class="shortcut">&shortcut:EditorEnter;</span>를 누르세요.

<span class="control">`Process Duplicates`</span>을 승인하여 동일한 코드 조각의 두 번째 반복도 추출되도록 하세요.