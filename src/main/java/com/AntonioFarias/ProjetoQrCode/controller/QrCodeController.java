package com.AntonioFarias.ProjetoQrCode.controller;


import com.AntonioFarias.ProjetoQrCode.dto.QrCodeGenerateRequest;
import com.AntonioFarias.ProjetoQrCode.dto.QrCodeGenerateResponse;
import com.AntonioFarias.ProjetoQrCode.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeGeneratorService) {
        this.qrCodeGeneratorService = qrCodeGeneratorService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request){
        try{
            QrCodeGenerateResponse response =  this.qrCodeGeneratorService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
