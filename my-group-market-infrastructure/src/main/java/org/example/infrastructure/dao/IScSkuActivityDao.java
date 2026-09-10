package org.example.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.dao.po.ScSkuActivity;
import org.example.infrastructure.dao.po.Sku;

@Mapper
public interface IScSkuActivityDao {
    ScSkuActivity querySkuActivity(Sku sku);
}
