## 지연 초기화 (#1)

빈 `PowerPlant` 인터페이스로 시작해서, 이를 바탕으로 `ElectricMotor`와 `CombustionEngine` 클래스를 만드세요. `lateinit` 프로퍼티 `powerPlant`를 포함하는 `Vehicle` 클래스를 만드세요.

파일 범위에 `lateinit` `car`를 생성하고, `main()` 내부에 `lateinit` `truck`을 생성하세요. `main()` 내부에서 `car`를 초기화하며 전기 모터를 할당한 뒤, 연소 엔진을 할당하여 `truck`을 초기화하세요.

<sub> 이 과제는 자동 테스트를 포함하지 않으므로,
"체크"를 실행하면 항상 "정답"으로 표시됩니다.
제공된 솔루션과 자신의 솔루션을 비교하세요! </sub>