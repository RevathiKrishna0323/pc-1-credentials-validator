package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password) {
        CredentialsValidator credentialsValidator = ((userId, password_1) -> {
            if (name.equals("admin") && password.equals("1234")) {
                return " Valid user ";
            } else {
                return "Invalid user";
            }

        });
        return credentialsValidator.validator(name, password);
    }
}