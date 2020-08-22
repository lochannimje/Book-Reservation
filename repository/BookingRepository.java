package com.infy.mangement.InfyBooking.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.mangement.InfyBooking.entity.BookingEntity;




@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
	List<BookingEntity> findByDate(Date date);

	BookingEntity getOne(Integer booking_id);
}
