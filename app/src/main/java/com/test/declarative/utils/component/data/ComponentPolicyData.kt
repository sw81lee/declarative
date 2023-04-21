package com.test.declarative.utils.component.data


/**
 * Component 구성 데이터
 */
sealed class ComponentData

/**
 * Scaffold 와 연동 해야 하므로 머리/가슴/배 곤충 구조로 합니다.
 */
sealed class HeaderBarData : ComponentData()
sealed class BodyData : ComponentData()
sealed class BottomBarData : ComponentData()

/**
 * Component 단위의 데이터 필요
 */
data class HeaderType1(val message: String) : HeaderBarData()
data class HeaderType2(val imageSource: String) : HeaderBarData()

/**
 * HeaderBar 와 BottomBar 는 어차피 클래스 하나니...미리 Define 해서 받으면 될거 같음 (우왕?)
 */
data class BottomType1(
    val firstMenuImage: String,
    val firstMenuName: String,
    val secondMenuImage: String,
    val secondMenuName: String
)

data class BottomType2(
    val firstMenuImage: String,
    val firstMenuName: String,
    val secondMenuImage: String,
    val secondMenuName: String,
    val thirdMenuImage: String,
    val thirdMenuName: String
)

/**
 * Body 가 문제인데.... 아니 리스트, 텍스트, 그리드....등등 여러 타입이 있을 수 있음.
 * 리스트 + 텍스트 등 복합 구조 필요한 경우가....
 * 아예 이런 구조 자체를 다 잡아놓고 Type 에 따라서 Data 만 받아서 쓰는 경우를 생각해 볼 수 있음
 * Body Tpye 1에 미리 리스트고 텍스트고 버튼이고 다 넣어놓고.... visible 여부 혹은 아이템들만 받아서 넣는 식
 * 이게 현실적으로 맞는거 같은데 -_-?
 * 아니 도대체 -_-? 이 이상 유동적일 이유가 뭐가 있는거지? -_-? //TODO 누구한테 물어보면 이거 답변이 나오냐. 권인칠? 박세준? 안훈민? -_-? =ㅅ=!!!
 */

