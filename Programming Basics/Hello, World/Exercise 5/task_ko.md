## IDE 숙달하기: 기본 편집

IntelliJ IDEA에서는 일반적인 운영 체제 단축키를 사용하여 기본 편집 작업을 수행할 수 있습니다:

| 작업       | 단축키                                            | 설명                                                              |
|-----------|-------------------------------------------------|------------------------------------------------------------------|
| 자르기     | <span class="shortcut">&shortcut:$Cut;</span>   | 현재 줄 또는 선택된 코드 블록을 클립보드로 잘라냅니다.             |
| 복사       | <span class="shortcut">&shortcut:$Copy;</span>  | 현재 줄 또는 선택된 코드 블록을 클립보드로 복사합니다.             |
| 붙여넣기   | <span class="shortcut">&shortcut:$Paste;</span> | 클립보드의 내용을 커서 위치에 붙여넣습니다.                        |
| 실행 취소   | <span class="shortcut">&shortcut:$Undo;</span>  | 마지막 작업을 실행 취소합니다.                                     |
| 다시 실행   | <span class="shortcut">&shortcut:$Redo;</span>  | 실행 취소된 마지막 작업을 다시 실행합니다.                         |

텍스트를 선택하려면, "Shift" 키를 누른 상태로 커서를 이동하며 텍스트를 선택할 수 있습니다.  
그 다음, 커서를 위나 아래, 왼쪽 또는 오른쪽으로 이동시키거나 한 줄의 끝 또는 시작으로 이동할 수 있습니다:

| 작업                               | 단축키                                                                 | 설명                                                               |
|-----------------------------------|-----------------------------------------------------------------------|-------------------------------------------------------------------|
| 선택하며 위로 이동                 | <span class="shortcut">&shortcut:EditorUpWithSelection;</span>        | 커서를 한 줄 위로 이동하며 텍스트를 선택합니다.                     |
| 선택하며 오른쪽으로 이동           | <span class="shortcut">&shortcut:EditorRightWithSelection;</span>     | 커서를 오른쪽으로 한 문자 이동하며 텍스트를 선택합니다.              |
| 선택하며 줄 끝으로 이동           | <span class="shortcut">&shortcut:EditorLineEndWithSelection;</span>   | 커서를 줄의 끝으로 이동하며 텍스트를 선택합니다.                    |
| 선택하며 줄 시작으로 이동          | <span class="shortcut">&shortcut:EditorLineStartWithSelection;</span> | 커서를 줄의 시작으로 이동하며 텍스트를 선택합니다.                   |

`println("Hello, Kotlin!")` 줄을 복제하려면 선택한 후 복사하여 붙여넣으십시오.