## 속성 접근자 (#3)

`MessageStorage`라는 클래스를 생성하고 두 개의 속성을 추가하세요:  
`MutableList<String>` 타입의 `private` 속성 `_messages`와  
`List<String>` 타입의 `public` 속성 `messages`.  
`messages`에 대한 커스텀 getter는 `_messages`를 반환합니다.

`_messages`가 `private`로 선언되어 있기 때문에, 해당 클래스인 `MessageStorage` 내에서만 그 내용을 변경할 수 있습니다.  
`String` 파라미터를 받아 `_messages` 리스트에 추가하는 `addMessage()` 멤버 함수를 정의하세요.