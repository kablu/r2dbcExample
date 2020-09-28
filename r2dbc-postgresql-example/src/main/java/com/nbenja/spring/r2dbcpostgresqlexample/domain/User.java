package com.nbenja.spring.r2dbcpostgresqlexample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("public.users")
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class User {

  @Id
  private Integer id;
  private String name;
}
