package com.projekan.tiket_pesawat.services;

import com.projekan.tiket_pesawat.models.Booking;
import com.projekan.tiket_pesawat.models.Penerbangan;
import com.projekan.tiket_pesawat.models.Penumpang;
import com.projekan.tiket_pesawat.models.User;
import com.projekan.tiket_pesawat.repository.BookingRepository;
import com.projekan.tiket_pesawat.repository.PenerbanganRepository;
import com.projekan.tiket_pesawat.repository.PenumpangRepository;
import com.projekan.tiket_pesawat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViewServiceImp {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private PenumpangRepository penumpangRepository;
    @Autowired
    private PenerbanganRepository penerbanganRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Booking> findBookingAll() {
        return bookingRepository.findAll();
    }
    public List<Penumpang> findPenumpangAll() {
        return penumpangRepository.findAll();
    }
    public List<Penerbangan> findPenerbanganAll() {
        return penerbanganRepository.findAll();
    }
    public List<User> findUserAll() {
        return userRepository.findAll();
    }
}
