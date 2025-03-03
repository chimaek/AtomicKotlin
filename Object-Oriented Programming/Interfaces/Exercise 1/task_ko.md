## 인터페이스 (#1)

`Computer`를 구현하는 `Cloud` 클래스를 생성하고, `List<Node>`를 포함하도록 하세요.  
`class Node(private val result: Int)`도 `Computer`를 구현해야 하며, `calculateAnswer()`를 구현하여 단순히 `result`를 반환하도록 하세요.

`Cloud` 생성자는 `Node`의 개수를 나타내는 인수 `n`을 받아야 합니다.  
`n`까지 세고, 현재 생성 중인 `Node`의 `result` 값으로 각 카운트를 설정하세요.  
`Cloud`의 `calculateAnswer()`를 구현하여 모든 `Node`에서 답안의 합계를 반환하도록 하세요.