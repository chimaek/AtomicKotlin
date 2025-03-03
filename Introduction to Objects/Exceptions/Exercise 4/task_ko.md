## IDE 숙달하기: Stacktrace 분석

스택트레이스에서 예외가 발생한 줄을 클릭하면 해당 줄로 자동으로 이동할 수 있습니다.  
`Task.kt`를 실행하여 스택트레이스를 확인하고, 다른 줄로 이동해 보세요.

또한, 버그 트래커와 같은 다른 곳에서 복사한 스택트레이스를 분석할 수도 있습니다.  
다음 스택트레이스를 복사하고 <span class="control">`Stacktrace 분석`</span> 작업을 실행하세요:

```text
Exception in thread "main" java.lang.IllegalStateException: something is wrong
    at stacktrace.TaskKt.foo(Task.kt:4)
    at stacktrace.TaskKt.bar(Task.kt:8)
    at stacktrace.TaskKt.main(Task.kt:12)