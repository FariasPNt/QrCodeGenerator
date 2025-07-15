package com.AntonioFarias.ProjetoQrCode.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String fileName, String contentType);
}
