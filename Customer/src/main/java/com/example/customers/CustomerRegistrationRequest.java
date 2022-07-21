package com.example.customers;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
