package com.hwua.dao;

import com.hwua.entity.Address;

import java.util.List;

public interface AddressDao {

    public int insert(Address address);

    public List<Address> select(int as_userid);
}
