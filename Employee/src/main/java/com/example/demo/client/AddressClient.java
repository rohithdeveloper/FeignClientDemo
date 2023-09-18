package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.AddressDto;

@FeignClient(name = "address_service", url = "http://localhost:8080")
public interface AddressClient {

	@GetMapping("address/{id}")
	public AddressDto getAddressById( @PathVariable("id") Long id) ;
}
