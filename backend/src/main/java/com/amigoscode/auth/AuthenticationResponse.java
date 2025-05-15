package com.amigoscode.auth;

import com.amigoscode.customer.types.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
