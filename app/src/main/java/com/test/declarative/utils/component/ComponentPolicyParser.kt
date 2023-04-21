package com.test.declarative.utils.component

import com.test.declarative.utils.component.data.ComponentData
import org.json.JSONObject


/**
 * 서버에서 받은 데이터를 파싱한다.
 * 아마도 최초 데이터는 Splash 에서 받지 않을까...
 * //TODO 스펙을 정해야 한다
 * - 데이터의 버전 체크가 필요한가?
 * - 아니라면 매번 받나?
 * - 받는다면 저장은 데이터 베이스에? Room 데이터 베이스의 버전관리 정책은 어떻게 하지?
 * - 뭐 다 그렇다 치고 일단 Json 의 구성 형태는 어떻게 될까? 열라 다양한 Component 의 요구 사항을 다 충족 시킬 수 있는 유연한 구조는 Json 만.
 */
fun createComponentData(json : JSONObject) : ComponentData? = null