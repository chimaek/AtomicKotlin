## 맵 (#2)

`Cage` 객체는 `Hamster`를 저장합니다. `Cage`는 고정된 크기를 가지며, 이미 가득 찬 경우에는 `Hamster`를 추가할 수 없습니다.

이 과제에서는 `Hamster`가 `List`에 저장됩니다. 다음 과제에서는 `List` 대신 `Map`이 사용될 예정입니다.

`get(name: String)`을 `Cage`의 멤버 함수로 구현하여 `name`에 해당하는 `Hamster`를 반환하세요. 만약 그 `name`에 해당하는 `Hamster`가 없다면 `NoSuchElementException`을 던지세요.