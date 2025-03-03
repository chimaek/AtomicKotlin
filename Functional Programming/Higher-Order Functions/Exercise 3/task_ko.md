## 고차 함수 (#3)

당신만의 `mapIndexedNotNull()` 버전을 작성하세요. `mapNotNull()`처럼 주어진 변환을 각 요소에 적용하고 `null`을 필터링합니다. 또한, `mapIndexed()`처럼 요소와 해당 인덱스를 기반으로 변환을 수행합니다.

제네릭 타입 `R?` (예: `(Int, T) -> R?`)와 `List<R>`에 주목하세요. `R?`의 `?`는 람다의 반환 타입이 null 허용 타입임을 나타냅니다. `mapIndexedNotNull()`은 null이 아닌 요소들의 리스트를 반환하므로 함수 반환 유형은 `List<R>`입니다. `R`이 null이 불가능한(non-nullable) 유형임을 표현하기 위해 제네릭 타입 매개변수에 *제약조건*을 지정합니다: `R: Any`.