package com.github.vv.converter.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

import com.github.vv.dto.UserDTO;
import com.github.vv.model.Authority;
import com.github.vv.model.User;


public class UserDTOConverter implements Converter<UserDTO, User> {

    @Override
    public User convert(final UserDTO dto) {
        final User user = new User();

        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setAccountNonExpired(false);
        user.setCredentialsNonExpired(false);
        user.setEnabled(true);
        List<Authority> authorities = new ArrayList<>();
        if(dto.getUsername().equals("pratap")){       
        	 authorities.add(Authority.ROLE_USER);
        	 authorities.add(Authority.ROLE_ADMIN);
       
        }else
        {
        	 authorities.add(Authority.ROLE_USER);
        }
        user.setAuthorities(authorities);
        return user;
    }
}
