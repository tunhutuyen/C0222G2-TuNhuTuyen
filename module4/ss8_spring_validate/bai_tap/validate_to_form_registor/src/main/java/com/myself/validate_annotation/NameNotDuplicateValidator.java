package com.myself.validate_annotation;

import com.myself.model.User;
import com.myself.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NameNotDuplicateValidator implements ConstraintValidator<NameNotDuplicate,String> {

    @Autowired
    private IUserRepository iUserRepository;

    // tự tao annotation
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        List<User> users = iUserRepository.findAll();
        for (User user:users) {
            if (user.getFirstName().equals(value)){
                return false;
            }
        }
        return true;
    }
}
