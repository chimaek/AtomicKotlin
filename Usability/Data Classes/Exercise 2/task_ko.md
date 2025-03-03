## 데이터 클래스 (#2)

`transferTicket()`이라는 확장 함수를 만들어 `AirlineTicket` 객체를 복사하고, 복사 과정에서 `firstName`과 `lastName`을 새로운 값으로 교체하세요:

```kotlin
fun AirlineTicket.transferTicket(
  otherFirstName: String,
  otherLastName: String
): AirlineTicket