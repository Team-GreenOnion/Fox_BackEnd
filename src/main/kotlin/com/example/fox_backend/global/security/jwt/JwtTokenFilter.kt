package com.example.fox_backend.global.security.jwt

import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JwtTokenFilter (
    private val jwtProvider: JwtProvider
): OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val bearer : String? = jwtProvider.resolveToken(request)
        SecurityContextHolder.clearContext()
        bearer.let { SecurityContextHolder.getContext().authentication = jwtProvider.authentication(bearer) }

        filterChain.doFilter(request, response)
    }
}