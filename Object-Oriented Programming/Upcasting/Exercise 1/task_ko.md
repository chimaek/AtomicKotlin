## 업캐스팅 (#1)

시작 코드에는 `Rodent` 인터페이스와 이 인터페이스를 구현한 두 클래스인 `Mouse`와 `KangarooRat`이 포함되어 있습니다. `Rodent`는 `eat()`과 `speak()` 함수를 선언하며, 이 함수들은 서브클래스에서 반드시 구현되어야 합니다. `KangarooRat`은 `jump()` 함수를 추가로 정의합니다.

`upcast(rodent: Rodent)`라는 함수를 만들어 `trace()`를 사용해 `eat()`과 `speak()`의 결과를 출력하세요. 컴파일러가 `jump()`를 호출하도록 허용하지 않는다는 것을 확인하세요.

`main()`은 `Mouse`와 `KangarooRat`의 인스턴스를 생성하고, 후자의 경우 `jump()`를 호출할 수 있으며, 두 객체를 모두 `upcast()` 함수에 전달할 수 있음을 보여줍니다. `main()`의 출력 결과를 예상한 뒤, `main()`을 실행하여 예상이 맞는지 확인하세요.