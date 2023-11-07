package com.atamertc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mongoDb")
@Lazy
public class MongoDbDataService implements DataService {

    @Override
    public int[] getData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
