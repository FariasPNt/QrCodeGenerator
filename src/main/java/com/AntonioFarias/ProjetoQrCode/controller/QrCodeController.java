package com.AntonioFarias.ProjetoQrCode.controller;


import com.AntonioFarias.ProjetoQrCode.dto.QrCodeGenerateRequest;
import com.AntonioFarias.ProjetoQrCode.dto.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {


    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request){
        return null;
    }
}
