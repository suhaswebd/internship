package com.mobile.mobile.repository;

import com.mobile.mobile.entity.AddProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository<AddProduct,Integer> {



}
