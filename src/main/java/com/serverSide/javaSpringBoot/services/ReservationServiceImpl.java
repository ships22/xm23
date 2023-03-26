package com.serverSide.javaSpringBoot.services;

import com.serverSide.javaSpringBoot.model.ReservationModel;
import com.serverSide.javaSpringBoot.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository mReservationRepository;

    @Override
    public ReservationModel create(ReservationModel reservationModel){

        return  mReservationRepository.save(reservationModel);
    }
    @Override
    public Optional<ReservationModel> findById(Long reservation_id) {

        return mReservationRepository.findById(reservation_id);
    }

    @Override
    public List<ReservationModel> findAll() {

        return mReservationRepository.findAll();
    }

    @Override
    public ReservationModel update(ReservationModel reservationModel){
        return  mReservationRepository.save(reservationModel);
    }

    @Override
    public void delete(long reservation_id) {
        mReservationRepository.deleteById(reservation_id);
    }
}
