package com.amigoscode.customer.types;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
