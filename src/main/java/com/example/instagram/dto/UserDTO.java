package com.example.instagram.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer idUser;
    @NotBlank(message = "FirstName is mandatory")
    private String firstname;
    @NotBlank(message = "LastName is mandatory")
    private String lastname;
    @NotBlank(message = "BirthDate is mandatory")
    private LocalDate birthDate;
    @NotBlank(message = "Email is mandatory")
    private  String email;
    @NotBlank(message = "Phone is mandatory")
    private  String phone;
    @NotBlank(message = "Password is mandatory")
    private  String password;
}
