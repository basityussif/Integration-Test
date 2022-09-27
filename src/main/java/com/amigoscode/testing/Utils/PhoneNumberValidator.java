package com.amigoscode.testing.Utils;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class PhoneNumberValidator implements Predicate<String> {

    @Override
    public boolean test(String phoneNumber) {
        if(phoneNumber.startsWith("+233") && phoneNumber.length() == 13){
            return true;
        }
        return false;
    }
}
