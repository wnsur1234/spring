package com.grepp.spring.app.model.rent;

import com.grepp.spring.app.model.rent.dto.Rent;
import com.grepp.spring.app.model.rent.dto.RentBook;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RentRepository {

    @Select("select * from rent")
    Rent selectAll();
    
    @Select("select * from rent_book where rent_id = #{rentId}")
    List<RentBook> selectRentBookByRentId(Integer rentId);

}
