package com.projekan.tiket_pesawat.services;

public interface EmailService {
    void kirimToken(String email, String verifikasiToken , String refreshToken);
    void kirimOtp(String email,String otpCode);
}
