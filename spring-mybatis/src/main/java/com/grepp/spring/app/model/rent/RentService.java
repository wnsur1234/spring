package com.grepp.spring.app.model.rent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RentService {

    private final RentRepository rentRepository;

}
