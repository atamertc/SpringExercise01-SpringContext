package com.atamertc;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope
@Component
@Primary
public class PostgreSqlDbDataService implements DataService{
    @Override
    public int[] getData() {
        return new int[]{10,20,30,40,50};
    }
}
