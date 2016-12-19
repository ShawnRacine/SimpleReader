package com.racine.mapper;

import com.racine.beans.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Shawn Racine on 2016/12/19.
 */
@Mapper
public interface CategoryMapper {
    List<Category> getCategory();
}
