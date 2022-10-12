package com.kgisl.webflux2.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentMongo {
    @Id
    private String id;
    private String firstName;
    private String gender;
	private String contactNo;
    
}
