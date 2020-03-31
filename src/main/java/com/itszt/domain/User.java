package com.itszt.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "user")
@Data
@Getter
@Setter
@ToString
public class User {

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private LocalDateTime time;





}
