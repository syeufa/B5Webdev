package com.tujuhsembilan.maincore.dto;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanySampleDTO {
    private String companyName;

    @Pattern(regexp = "^[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]-[0-9]{3}\\.[0-9]{3}$")
    private String npwp;    
}