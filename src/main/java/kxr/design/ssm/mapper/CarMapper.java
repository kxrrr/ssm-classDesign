package kxr.design.ssm.mapper;

import kxr.design.ssm.entity.Car;
import kxr.design.ssm.vo.StoreList;
import kxr.design.ssm.vo.StoreQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface CarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);

    List<StoreList> selectSelective(StoreQuery storeQuery);

    List<Car> selectBySeriesId(Integer seriesId);

    int selectRepertoryByPrimaryKey(Long carId);

    int updateRepertoryByPrimaryKey(@Param("carId") Long carId, @Param("carNumber") Integer carNumber);

    int addRepertoryByPrimaryKey(@Param("carId") Long carId, @Param("carNumber") Integer carNumber);

    BigDecimal selectSalePriceByPrimaryKey(Long carId);
}