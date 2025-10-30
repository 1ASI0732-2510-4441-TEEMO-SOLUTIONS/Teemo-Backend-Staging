package org.teemo.solutions.upcpre202501cc1asi07324441teemosolutionsbackend.iam.infrastructure.tokens.jwt;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.teemo.solutions.upcpre202501cc1asi07324441teemosolutionsbackend.iam.application.internal.outboundservices.tokens.TokenService;

public interface BearerTokenService extends TokenService {
    String getBearerTokenFrom(HttpServletRequest request);
    String generateToken(Authentication authentication);
}
