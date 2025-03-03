## 요약 2 (#7)

자연수를 로마 숫자 체계의 숫자로 변환하세요.

로마 숫자:
1000 = M, 900 = CM, 500 = D, 400 = CD, 100 = C, 90 = XC,  
50 = L, 40 = XL, 10 = X, 9 = IX, 5 = V, 4 = IV, 1 = I.

예를 들어: 23 = XXIII, 44 = XLIV, 100 = C.

<div class="hint">

변환 과정을 단계별로 수행하세요. 변환 후 남은 숫자를 저장할 보조 변수 `remainder`와 결과 로마 숫자 표현을 저장할 `result` 변수를 사용하세요. 각 단계에서 초기 `number`는 `remainder`와 `result`의 합과 동일합니다.

로마 숫자를 `Int`에서 연관된 `String` 표현으로 매핑한 저장소에 보관하세요. 각 `int = roman` 쌍에서 `1000 = M`부터 아래 단계를 따라 작업하세요:

- `remainder`를 `int`로 나누어 `roman`을 `result`에 몇 번 반복해야 하는지 확인합니다.

- 결과 값을 `remainder`에서 빼서 업데이트합니다:  
  `remainder -= remainder / int`.

</div>