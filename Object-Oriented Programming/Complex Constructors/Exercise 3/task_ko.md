## 복합 생성자 (#3)

여러 `init` 섹션이 선언된 순서대로 실행된다는 것을 보여주세요. 시작 코드에는 `MultipleInit` 클래스가 있고, `val initOrder = mutableListOf<String>()` 속성이 포함되어 있습니다. 세 개의 서로 다른 `init` 블록에서 `initOrder` 속성에 `"one"`, `"two"`, `"three"` 문자열을 추가하세요.