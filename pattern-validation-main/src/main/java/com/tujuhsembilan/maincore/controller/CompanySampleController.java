package com.tujuhsembilan.maincore.controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;



import com.tujuhsembilan.maincore.dto.CompanySampleDTO;

@RestController
@RequestMapping("/company")
public class CompanySampleController {
    @PostMapping
    public ResponseEntity<Object> addCompany(@Valid @RequestBody CompanySampleDTO dto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Jika validasi gagal, Anda dapat mengembalikan pesan kesalahan khusus yang telah Anda tentukan
            return ResponseEntity.badRequest().body("NPWP format is not valid. NPWP must be in the format xx.xxx.xxx.x-xxx.xxx");
        }
        
        // Lakukan operasi lain untuk menyimpan data Company jika validasi berhasil
        return ResponseEntity.ok(dto);
    }
}