## 가시성 제한 (#3)

`Robot`은 앞으로만 이동할 수 있습니다. `steps` 인수가 양수인지 확인하십시오. `right()`, `left()`, `down()` 및 `up()`의 경우, 음수 또는 0인 `steps` 인수는 위치를 업데이트하지 않아야 합니다. 대신 다음 `String`을 사용하여 콘솔 출력이 생성되어야 합니다:

```text
"steps argument must be positive, is $steps"
```

`main()`에서, `steps`의 양수, 음수 및 0 값을 사용하여 코드를 테스트하십시오.