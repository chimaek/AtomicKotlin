## 구조 분해 선언 (#3)

시작 코드에는 두 가지 속성 `name: String`과 `age: Int`를 포함하는 `data` 클래스 `Person`이 포함되어 있습니다. `person: Person`을 매개변수로 받아 다음 문법을 사용하여 이를 구조 분해하는 `displayPersonInfo()` 함수를 작성하세요:

```kotlin
val (name, age) = person
```

`displayPersonInfo()`는 콘솔에 해당 값을 출력해야 합니다:

```text
Name: $name
Age: $age
```

`Person`에 `name`과 `age` 사이에 두 번째 속성 `surname`을 추가하세요. 첫 번째 속성은 `name`이고 세 번째 속성은 `age`여야 합니다. `displayPersonInfo()`는 수정하지 마세요. `main()`에서 `displayPersonInfo()`가 이제 올바르게 작동하지 않는다는 것을 보여주세요.