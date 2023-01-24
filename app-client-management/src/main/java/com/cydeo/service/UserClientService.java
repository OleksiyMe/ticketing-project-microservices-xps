package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//value - name from Eureka Service Discovery. If it matches u can omit using url and don't care about the port
@FeignClient(value = "user-service",url = "http://localhost:9090")
public interface UserClientService {

    @GetMapping("/api/v1/user/{username}")
    UserResponseDTO getUserDTOByUserName(@PathVariable("username") String username);
}
