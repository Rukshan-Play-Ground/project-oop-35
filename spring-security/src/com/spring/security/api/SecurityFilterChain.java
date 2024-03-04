package com.spring.security.api;
import com.spring.security.config.*;
import com.spring.security.util.*;
public class SecurityFilterChain {
    MethodSecurity methodSecurity;
    WebSecurityConfig webSecurityConfig;
    Intercepter intercepter;
    PostAuth postAuth;
}
