## 오버로딩 (#3)

`myJoinToString()`이라는 함수의 오버로딩된 버전을 구현하세요. 각 오버로딩된 함수 호출에서 매개변수에 대한 기본값을 전달하세요. 이때, 이 기능을 지원하는 언어의 기능을 사용하지 마세요.

왜 아래 두 함수를 동시에 정의할 수 없을까요?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

스타터 코드에서 `myJoinToString(prefix: String, postfix: String)` 함수를 주석 해제하고, 어떤 오류가 발생하는지 확인하세요.