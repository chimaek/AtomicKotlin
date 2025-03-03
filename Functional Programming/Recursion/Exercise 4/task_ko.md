## 재귀 (#4)

초기 코드에는 `City` 클래스가 제공됩니다. 현재의 `City`에서 도달할 수 있는 모든 도시의 집합을 만드는 확장 함수 `City.allReachable()`을 구현하세요. 이를 재귀적으로 및 반복적으로 모두 구현해야 합니다.

각 `City`의 직접적인 연결은 해당 `connections` 속성에 저장됩니다. `allReachable()`은 주어진 도시로부터 다른 도시를 통해 도달할 수 있는 모든 도시를 반환해야 합니다. 도시는 자신으로부터 도달 가능한 상태이므로 결과 집합에도 포함되어야 합니다.

예를 들어, 다음의 연결 그래프를 고려해 보세요:

```text
도시들: Dublin, Liverpool, Manchester, Leeds
연결: Liverpool - Manchester; Manchester - Leeds
```

Liverpool로부터 Manchester와 Leeds는 도달할 수 있지만, Dublin은 그렇지 않습니다. Liverpool에서 Leeds로 가는 경로는 Manchester를 통해 갑니다. 따라서, Liverpool에 대한 `allReachable()`은 세 도시(Liverpool, Manchester, Leeds)의 집합을 반환해야 합니다.