package com.spawithspa.spawithspa.service;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.spawithspa.spawithspa.model.Booking;

@Service
public class BookingService {

    private final MongoOperations mongoOperations;

    public BookingService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public List<Booking> getAllBookings() {
        return mongoOperations.findAll(Booking.class);
    }

    public Booking createBooking(Booking booking) {
        return mongoOperations.insert(booking);
    }

}
