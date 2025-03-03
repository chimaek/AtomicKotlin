## 동반 객체 (#3)

다음 클래스를 생성하세요:

```kotlin
data class ID(
  val name: String,
  val id: String = idGenerator()
) {
  companion object {
    // ...
    private fun idGenerator() = TODO()
    fun test(n: Int) = List(n) {
      ID(('a' + it).toString())
    }
  }
}
```

`ID`는 `idGenerator()`와 해당 함수를 지원하기 위한 코드만 포함합니다: 각 `id`의 `size`, 값이 `47`로 설정된 난수 생성기, 그리고 랜덤하게 `id`를 생성하기 위해 사용되는 문자들의 `source`가 필요합니다. `main()`에서 출력은 `test()`를 사용하여 확인되는데, 이는 `n`개의 `ID` 객체들로 이루어진 `List`를 생성합니다 -- 코드가 `main()`에서의 `test()` 출력과 일치할 때까지 수정하세요.

이제 이 클래스를 완성하세요:

```kotlin
class Bank(val name: String) {
  // 신청은 했지만 완료되지 않은 계좌:
  private val applied = TODO()
  private val accounts = TODO() // 완료됨
  private class Account(val name: String) {
    var id: ID? = null
    private var number: Long? = null
    fun addID(verifiedID: ID) = TODO()
    companion object Numbers {
      private fun nextAccountNumber() = TODO()
    }
    fun finish() = TODO()
    override fun toString() = "$id $number"
  }
  fun applyForAccount(name: String) = TODO()
  fun addID(id: ID) = TODO()
  fun completeAccount(verifiedID: ID) = TODO()
  override fun toString() =
    accounts.joinToString("\n")
}
```

이것은 객체 생성 과정에서 여러 단계를 요구하는 클래스를 위한 *빌더* 패턴의 예입니다. `applyForAccount()`는 새로운 `Account`의 생성 과정을 시작하며 이를 `applied` 리스트에 추가합니다. `addID()`는 `Account`에 `ID` 객체를 추가하고, `completeAccount()`는 `ID`를 수락한 후 계좌 `number`를 추가하고 `Account`를 `applied` 리스트에서 `accounts` 리스트로 이동시킵니다.

`main()`의 시작 코드가 여러분의 솔루션을 검증할 것입니다.

<sub> 이 과제는 자동 테스트를 포함하지 않습니다. 
따라서 "Check"를 실행하면 항상 "Correct"로 표시됩니다.
여러분의 솔루션과 제공된 솔루션을 비교해 보세요! </sub>