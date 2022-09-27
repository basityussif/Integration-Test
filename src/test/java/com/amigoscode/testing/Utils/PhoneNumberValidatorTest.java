package com.amigoscode.testing.Utils;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private  PhoneNumberValidator underTest;

    @BeforeEach
    void setUp (){
        underTest = new PhoneNumberValidator();
    }


    @ParameterizedTest
    @CsvSource({"+233000000000,TRUE", "+233000000000000, FALSE", "233000000000, FALSE"})
    void ItShouldValidatePhoneNumber(String phoneNumber, String expected){
        //WHEN
        boolean isValid = underTest.test(phoneNumber);
        //THEN
        assertThat(isValid).isEqualTo(Boolean.valueOf(expected));
    }

}
