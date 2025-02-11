package com.example.ifkakao.presentation.session_list

import com.example.ifkakao.domain.model.Session

data class SessionListState(
    val sessionDay: Int = 0,
    val isFilterEnable: Boolean = false,
    val showLikeOnly: Boolean = false,
    val sessionList: List<Session> = listOf(),
)
