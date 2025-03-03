## 기본 클래스 초기화 (#2)

시작 코드에서는 저녁 식사 테이블 세팅을 설명하는 클래스를 정의합니다:

- `Plate`, 그리고 `DinnerPlate`는 `Plate`를 상속합니다  
- `Utensil`, 그리고 그 후 `Spoon`, `Fork`, `Knife`는 모두 `Utensil`을 상속합니다  
- `Custom` (즉, "문화적 전통"이라는 의미로)

`PlaceSetting`을 `Custom`으로부터 상속합니다. `PlaceSetting` 내부에, `Spoon`, `Fork`, `Knife`, `DinnerPlate` 타입의 속성을 해당 순서로 생성합니다. `main()`은 `PlaceSetting`의 인스턴스를 생성하여 초기화 순서를 보여줍니다.