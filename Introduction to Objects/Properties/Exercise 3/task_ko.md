## 속성 (#3)

`Robot`은 크기 `100 x 100`의 정사각형 필드 내에서 움직일 수 있습니다. 이 필드의 경계는 "루프"되어 있습니다: 만약 로봇이 셀 `(0, 0)`에 있고 한 칸 위로 이동하면, 셀 `(0, 99)`로 이동하게 됩니다.

```text
(0, 0)
// 위로 한 칸 이동(up(1))
(0, 99)
// 왼쪽으로 10칸 이동(left(10))
(90, 99)
```

이 동작을 구현하려면 `right()`, `left()`, `up()` 및 `down()`을 수정하세요.

<div class="hint">

경계를 확인하기 위해 `crossBoundary()`라는 보조("헬퍼") 멤버 함수를 작성하세요. 이는 반복을 제거하고 결과 코드를 단순화합니다.

</div>