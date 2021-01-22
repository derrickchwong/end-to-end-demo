package com.example.demogemfireclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("Contacts") @Data @NoArgsConstructor @AllArgsConstructor
public class Contact {
    @Id
    private String id;
    private String name;
    private String address;
    private String phone;
}
