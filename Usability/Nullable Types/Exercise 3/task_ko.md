## Nullable Types (#3)

`countHexadecimalNumbers(codes: List<String>)`라는 함수를 생성하세요. 이 함수는 `codes`에 포함된 16진수를 세는 역할을 합니다. 결과로 `Map<Int, Int>`를 반환하며, 키는 16진수 숫자이고 값은 그 숫자가 `codes`에서 등장한 횟수입니다. 만약 `codes`의 `String`에 16진수가 포함되어 있지 않다면, 함수는 이를 무시합니다.

<div class="hint">

16진수 코드를 포함하는 `String`을 `Int`로 변환하려면 `String`의 확장 함수인 `toIntOrNull(radix: Int)`를 사용하세요. 이때 `radix`로 `16`을 전달하세요.

</div>