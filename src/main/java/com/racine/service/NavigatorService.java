package com.racine.service;

import com.racine.beans.Navigator;
import com.racine.mapper.NavigatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Shawn Racine on 2016/10/25.
 */
@Service
public class NavigatorService {

    @Autowired
    private NavigatorMapper mapper;

    public List<Navigator> getNavigator() {
        System.out.println("Mapper sout:" + mapper.getNavigator());
        return mapper.getNavigator();
    }
}
