## 클래스 생성 (#2)

`Giraffe`라는 클래스를 생성하고 단일 멤버 함수 `displayID()`를 추가하여 객체의 주소를 출력하세요. 기본 객체 표현에서 주소를 추출하려면 `String`의 `substringAfter()`를 호출하세요. 아래 코드를 실행하고 주소를 비교해 보세요:

```kotlin
val giraffe1 = Giraffe()
val giraffe2 = Giraffe()
val giraffe3 = Giraffe()
giraffe1.displayID()
giraffe2.displayID()
giraffe3.displayID()