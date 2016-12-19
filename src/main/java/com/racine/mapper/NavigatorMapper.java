package com.racine.mapper;

import com.racine.beans.Navigator;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Shawn Racine on 2016/10/25.
 */
@Mapper
public interface NavigatorMapper {
    List<Navigator> getNavigator();
}
