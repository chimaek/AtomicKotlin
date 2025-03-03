## `when` 표현식 (#1)

`cloudiness(cloudPercent: Int)`라는 함수를 만들어서 구름의 비율에 따라 다음과 같은 설명을 반환하도록 합니다: "Cloudy" (구름 비율이 81..100일 때), "Mostly Cloudy" (61..80), "Partly Sunny" (41..60), "Mostly Sunny" (21..40), 그리고 "Sunny" (0..20). 만약 전달된 인수가 0..100 범위 안에 속하지 않을 경우, `IllegalArgumentException`을 던지세요.