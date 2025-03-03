## 연산자 오버로딩 (#3)

`class Repository<T>(val initSize: Int = 10)`과 같은 컬렉션 스타일의 클래스를 생성하세요.  
이 클래스는 초기 크기가 `initSize`인 `private MutableList`인 `list`를 포함하며, 모든 요소는 `null`로 초기화됩니다.  
`r`이라는 이름의 `Repository`에 대해 다음과 같은 연산을 지원하도록 설정하세요:

- `r += rv`   
  `rv`를 `list`에서 첫 번째로 비어 있는 `null` 위치에 넣습니다. 만약 남아있는 `null` 위치가 없다면,  
  `rv`를 `list`의 맨 끝에 추가합니다.

- `r[n] = rv`  
  `rv`를 `list`의 위치 `n`에 넣습니다. `n`은 0 이상이고 `list.size`보다 작아야 하며,  
  `list[n]`은 `null`이 아니어야 합니다.

- `r[n]`  
  `list[n]`의 값을 반환합니다. `n`은 0 이상이고 `list.size`보다 작아야 하며,  
  `list[n]`은 `null`이 아니어야 합니다.

`list`를 쉼표로 구분하여 출력하는 `toString()`을 추가하세요.

`main()`에 있는 시작 코드가 `Repository`를 테스트하며, 오류 메시지가 어떻게 표시돼야 하는지 보여줍니다.

<sub> 이 과제에는 자동 테스트가 포함되어 있지 않으므로
"확인"을 실행할 때 항상 "정답"으로 표시됩니다.  
제공된 솔루션과 비교하여 확인하세요! </sub>