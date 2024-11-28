package com.evans.HolidayHotel.service.interfac;

import com.evans.HolidayHotel.dto.LoginRequest;
import com.evans.HolidayHotel.dto.Response;
import com.evans.HolidayHotel.entity.User;

public interface IUserService {
    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);
}
