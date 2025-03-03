## 상속 및 확장 (#2)

초기 코드에는 다음과 같은 계층 구조가 정의되어 있습니다: 슈퍼클래스 `Dog`, 그리고 두 서브클래스 `ToyDog`와 `RealDog`. `Dog`를 확장하는 확장 함수를 구현하세요. `play()`는 먼저 `speak()`를 호출한 다음 `sit()`를 호출합니다.

동일한 이름의 `play()`를 가진 두 개의 확장 함수를 추가로 구현하여 `RealDog`와 `ToyDog`를 확장하세요. 두 함수 모두 먼저 `Dog.play()`를 호출해야 하며, `RealDog.play()`는 `feed()`를 호출하고, `ToyDog.play()`는 `changeBatteries()`를 호출해야 합니다.

`main()` 코드에서 어떤 결과가 출력될지 예측한 뒤 직접 확인하세요.

<div class="hint">

`Dog.play()` 함수를 `Dog` 서브클래스의 확장 함수 내부 (예: `ToyDog.play()` 내부)에서 호출하려면 `this`를 명시적으로 `Dog`로 캐스팅하세요:

```kotlin
(this as Dog).play()
```

</div>