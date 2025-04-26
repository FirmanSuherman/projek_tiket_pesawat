package com.projekan.tiket_pesawat.controllers;

import com.projekan.tiket_pesawat.models.Booking;
import com.projekan.tiket_pesawat.models.Penerbangan;
import com.projekan.tiket_pesawat.models.Penumpang;
import com.projekan.tiket_pesawat.models.User;
import com.projekan.tiket_pesawat.services.ViewService;
import com.projekan.tiket_pesawat.services.ViewServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/view")
public class ViewController {
    @Autowired
    private ViewServiceImp viewService;
    @GetMapping("/login")
    public String loginPage(){
        return "user/login";
    }
    @GetMapping("/login/otp")
    public String registerPage(){
        return "user/otp";
    }
    @GetMapping("/user")
    public String userPage(Model model){
        List<Booking> bookings = viewService.findBookingAll();
        List<Penumpang> penumpangs = viewService.findPenumpangAll();
        List<Penerbangan> penerbangans = viewService.findPenerbanganAll();
        List<User> users = viewService.findUserAll();

        model.addAttribute("bookings", bookings);
        model.addAttribute("penumpangs",penumpangs);
        model.addAttribute("penerbangans",penerbangans);
        model.addAttribute("users",users);
        return "user/dist/index";
    }
    @GetMapping("/about")
    public String aboutPage(){return "user/dist/about";}
    @GetMapping("/panduan")
    public String panduanPage(){
        return "user/dist/panduan";
    }
    @GetMapping("/booking")
    public String bookingPage(){
        return "user/dist/form-element-input";
    }
    @GetMapping("/kursi")
    public String kursiPage(){
        return "user/dist/form-layout";
    }
    @GetMapping("/pembayaran")
    public String pembayaranPage(){return "user/dist/pembayaran";}
    @GetMapping("/jadwal")
    public String jadwalPage(){return "user/dist/jadwal";}
    @GetMapping("/histori")
    public String historiPage(){return "user/dist/histori";}
}
