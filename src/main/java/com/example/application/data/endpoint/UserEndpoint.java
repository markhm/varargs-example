package com.example.application.data.endpoint;

import java.util.List;
import java.util.Optional;

import com.example.application.data.entity.User;
import com.example.application.security.AuthenticatedUser;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.fusion.Endpoint;

import org.springframework.beans.factory.annotation.Autowired;

@Endpoint
@AnonymousAllowed
public class UserEndpoint {

    @Autowired
    private AuthenticatedUser authenticatedUser;

    public Optional<User> getAuthenticatedUser() {
        return authenticatedUser.get();
    }

    public List<Long> failingEndpoint(Long... something) {
        return null;
    }
}
