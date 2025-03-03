## 리스트 조작하기 (#4)

`friendSuggestions(person: Person)` 함수를 구현하여 
`person`의 친구의 친구를 반환하되, 이미 그 사람과 친구인 사람들은 제외하세요. 
다음과 같은 친구 관계를 고려하세요:

```text
Alice - Bob
Bob - Charlie
```

`friendSuggestions()`은 Alice를 위해 Charlie를 반환해야 합니다. 
왜냐하면 Charlie는 Alice의 친구인 Bob의 친구이고, 아직 Alice와 친구가 아니기 때문입니다.

다음 예제는 Alice에 대해 친구 추천을 생성하지 않습니다. 
왜냐하면 Bob과 Charlie는 이미 그녀의 친구이기 때문입니다:

```text
Alice - Bob
Alice - Charlie
Bob - Charlie