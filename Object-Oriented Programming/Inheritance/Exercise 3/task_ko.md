## 상속 (#3)

시작 코드에는 다음 클래스 계층 구조가 포함되어 있습니다:

- `Game`
- `BoardGame` ( `Game`을 상속)
- `Chess` ( `BoardGame`을 상속)

`Game`에 `val initOrder = mutableListOf<String>()` 속성을 추가하세요. 각 클래스에 해당 클래스 이름을 `initOrder`에 추가하는 `init` 블록을 작성하세요. `main()`에서 `Chess` 객체를 생성하고, 기본 클래스들의 초기화 순서를 표시하세요.