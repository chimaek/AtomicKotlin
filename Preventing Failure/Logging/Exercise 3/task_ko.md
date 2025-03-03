## 로깅 (#3)

`AtomicLog.kt`에 로깅 레벨을 추가하세요. `Trace`, `Debug`, `Info`, `Warn`, `Error` 값을 가진 열거형 `Level`을 생성하세요. 파일 범위에서 `Error`로 초기화된 `debugLevel`이라는 이름의 이 `enum`의 인스턴스를 추가하세요. 새 `Logger` 클래스 내부에서, `log()` 함수를 수정하여 시그니처를 `private fun log(thisLevel: Level, msg: String)`로 변경하세요. 이는 몇몇 다른 함수에 대해 약간의 수정이 필요할 것입니다. `main()`의 코드는 여러분의 솔루션을 테스트합니다.

<sub> 이 작업에는 자동 테스트가 포함되어 있지 않으므로, "검사"를 실행할 때 항상 "정답"으로 표시됩니다. 제공된 솔루션과 여러분의 솔루션을 비교하세요! </sub>