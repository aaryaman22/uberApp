package com.project.uber.uberApp.dto;

import com.project.uber.uberApp.enums.PaymentMethod;
import com.project.uber.uberApp.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private PaymentMethod paymentMethod;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private Double fare;
    private RideRequestStatus rideRequestStatus;
}

