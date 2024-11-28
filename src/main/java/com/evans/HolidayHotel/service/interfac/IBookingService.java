package com.evans.HolidayHotel.service.interfac;

import com.evans.HolidayHotel.dto.Response;
import com.evans.HolidayHotel.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
