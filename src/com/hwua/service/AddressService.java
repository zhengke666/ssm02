package com.hwua.service;

import com.hwua.entity.Address;

import java.util.List;

public interface AddressService {

    public String insert(Address address);

    public List<Address> select(int as_userid);
}
