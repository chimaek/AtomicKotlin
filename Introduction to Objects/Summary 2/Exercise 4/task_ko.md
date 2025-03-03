## 요약 2 (#4)

`Dictionary` 클래스를 생성하여 단어의 번역을 저장합니다. 이 클래스는  
멤버 함수 `addTranslations(word: String, translations: String)`을 포함합니다.  
`word`에 대한 `translations`는 공백 문자를 기준으로 구분됩니다.  
만약 `word`가 이미 `Dictionary`에 존재한다면, `addTranslations()`은  
`IllegalArgumentException`을 발생시키며 메시지로  
`"Dictionary already has translations for '$word'"`를 반환합니다.

`Dictionary`에는 읽기 전용 `translations` 속성도 포함되어 있으며, 이것은  
`List`로 구성된 `String`의 `Map`입니다. 이 `Map`의 키 또한 `String`입니다.

<div class="hint">

`split(" ")` 메서드를 `String`에 사용하여 단어를 공백 문자로 분리하세요.

</div>

<div class="hint">

`translations` 속성을 읽을 때 단순히 변환 가능한 `_translations` 속성을  
읽기 전용 `Map` 형태로 반환하도록 만듭니다. `_translations`라는 보조 속성을  
정의하여 번역을 저장하는 가변 `Map`을 포함하세요.

</div>