## 다형성 (#3)

`Connection`이라는 이름의 인터페이스를 생성하고 멤버 함수 `send(message: String)`을 추가하세요. 이 인터페이스를 `Text`, `Phone`, `Email`로 구현하세요. 각 구현에서 `send()`를 재정의하여, `"'$message' via Text"` (이 경우 `Text` 클래스)와 같은 `String`을 사용하여 `trace()`를 호출하도록 하세요.

이제 `val text: String`과 `val connection: Connection`을 생성자 인수로 사용하는 `Message` 클래스를 만드세요. `text`를 전송하는 `transmit()` 멤버 함수를 정의하세요.

`main()` 함수의 코드가 여러분의 솔루션을 테스트합니다.

<sub> 이 작업은 자동 테스트를 포함하지 않습니다.  
따라서 "확인"을 실행할 때 항상 "정답"으로 표시됩니다.  
제공된 솔루션과 여러분의 솔루션을 비교해보세요! </sub>