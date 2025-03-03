## IDE 마스터하기: 변수 추출

IntelliJ IDEA는 `val` 또는 `var`를 자동으로 추출할 수 있습니다. 문자열 템플릿 안의 `getFooResult()` 표현식을 선택한 후, 다음 중 하나를 수행하세요:

- <span class="control">`작업 찾기(Find action)`</span>를 호출한 다음(<span class="shortcut">&shortcut:GotoAction;</span> 키를 누르세요), 
`변수 추출(Extract variable)`을 입력하여 해당 작업을 찾습니다.

- <span class="shortcut">&shortcut:IntroduceVariable;</span> 키를 누릅니다.

- 애플리케이션 메뉴에서 <span class="control">`리팩터(Rafactor) | 추출(Extract) | 변수(Variable)...`</span>를 선택합니다.

새 변수의 이름을 입력합니다. IntelliJ IDEA는 표현식에 기반한 이름을 제안하려고 시도합니다. 
<span class="shortcut">&shortcut:EditorEnter;</span> 키를 눌러 완료하세요.