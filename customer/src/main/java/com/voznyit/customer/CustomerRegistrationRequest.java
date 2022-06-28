package com.voznyit.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}