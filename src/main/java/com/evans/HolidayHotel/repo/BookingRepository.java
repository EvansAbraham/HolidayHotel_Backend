package com.evans.HolidayHotel.repo;

import com.evans.HolidayHotel.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByRoomId(Long roomId);
    List<Booking> findByBookingConfirmationCode(Long confirmationCode);
    List<Booking> findByUserId(Long userId);
}
