## 불리언 (#2)

`&&`와 `||`를 위한 "진리표"를 만드세요. `showAnd(first: Boolean, second: Boolean)`라는 함수를 작성하여 `String` 템플릿을 사용해 `first`, `&&` 기호, `second`, `==` 기호, 그리고 `first && second`의 결과를 보여주세요. `showOr()`를 위한 유사한 함수를 작성하십시오.

`showAnd(true, true)`에 대한 샘플 출력은 다음과 같습니다:

```text
true && true == true
```

이제 `showTruthTable()`이라는 함수를 작성하여 `showAnd()`와 `showOr()`에 대해 `true`와 `false`의 모든 가능한 조합으로 생성된 표를 표시하세요. 모든 가능한 순서를 포함했는지 확인하십시오.