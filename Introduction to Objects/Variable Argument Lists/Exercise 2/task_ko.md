## 가변 인자 목록 (#2)

`String`을 첫 번째 매개변수로, `Int`의 `vararg` 매개변수를 두 번째 매개변수로 갖는 함수 `printArgs()`를 작성하세요. `printArgs()`는 매개변수를 콘솔에 표시합니다: 먼저 `String`, 그다음 쉼표로 구분된 `Int`들, 그리고 대괄호로 둘러싸인 형식으로 출력합니다.

예를 들어, `printArgs("Numbers: ", 1, 2, 3)`의 출력은 다음과 같아야 합니다:

```text
Numbers: [1, 2, 3]
```

<div class="hint">

`vararg` 매개변수에 대해 `toList()`를 사용하여 요구된 `String` 표현을 얻으세요.

</div>