## 프로퍼티 접근자 (#4)

`AccessCounter` 클래스에 프로퍼티 `accesses`를 생성하세요. 이 프로퍼티는 몇 번 접근되었는지를 알려줍니다.

<div class="hint">

`accesses`는 접근될 때마다 새로운 값을 계산합니다.

</div>

<div class="hint">

접근 횟수를 저장하기 위해 보조 `private _accesses` 프로퍼티를 도입하세요. 각 접근 시 getter에서 `_accesses`를 증가시키세요. Kotlin 스타일 가이드에서는 보조 프로퍼티의 이름을 밑줄(_)로 시작하도록 권장합니다.

</div>