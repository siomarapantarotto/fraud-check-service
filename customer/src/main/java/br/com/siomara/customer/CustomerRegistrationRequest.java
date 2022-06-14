package br.com.siomara.customer;

public record CustomerRegistrationRequest (
    String firstName,
    String lastName,
    String email) {

}
