## 요약 1 (#4)

이 연습은 `Overflow.kt`를 수정하여 `Long`과 `Double`을 테스트합니다.  
`testLong()`을 구현하여 `Long`의 최댓값에 `1`을 더한 값을 출력하세요.  
`testDouble()`을 만들어 `Double`의 최댓값에 `1`을 더한 값을 출력하세요.  
`testDouble2()`를 만들어 `Double.MAX_VALUE`와 `Double.MAX_VALUE + 1`이 서로 같은지 확인하는 결과를 출력하세요.

`Double` 타입은 일반적으로 메모리에서 64비트를 차지합니다.  
메모리 제한으로 인해 `Double`은 일부 정밀도를 사용하여 숫자를 나타냅니다.  
내부 표현에 대해서는 [위키백과](https://en.wikipedia.org/wiki/Double-precision_floating-point_format)에서 더 읽어볼 수 있습니다.

`Double.MAX_VALUE` 상수는 특별한 의미를 가지고 있습니다: 이것은 `Double`의 가장 큰 양의 유한 값을 보유합니다.  
이를 증가시킬 수는 없습니다. 양수를 더하려고 시도해도 동일한 최댓값이 결과가 됩니다. 이는 어느 정도 `Double.POSITIVE_INFINITY`와 비슷하게 작동합니다.  
이는 `Double`의 양의 무한 값을 보유하는 특별히 처리되는 상수입니다.  
이 상수들은 일반적인 `Double` 값들과 비교하는 데 사용할 수 있습니다.