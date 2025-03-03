## 멤버 참조 (#1)

시작 코드에는 `Pet`이라는 `data` 클래스를 포함하고 있으며, 이 클래스는 `var String` 속성인 `name`과 `enum` 속성인 `habitat`을 포함합니다. `Habitat` 열거형은 `LAND`, `WATER`, 또는 `AMPHIBIOUS`일 수 있으며, 특정 `Habitat`에서 `pet`이 사는지를 확인하는 멤버 함수 `livesIn(pet: Pet)`도 포함하고 있습니다.

`main()` 시작 코드에서는 `List<Pet>`을 생성합니다. 멤버 참조와 함께 `filter()`를 사용하여 리스트에서 땅에 사는, 물에 사는, 또는 양서류인 반려동물을 찾는 세 가지 함수 `liveOnLand()`, `liveInWater()`, `areAmphibious()`를 구현하세요. 마지막으로, `partition()`을 사용하여 반려동물을 양서류와 그렇지 않은 것으로 나누는 `partitionAmphibious()` 함수를 구현하세요.