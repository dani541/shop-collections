package org.ies.tierno.shop.readers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ies.tierno.shop.model.Shop;

import java.io.File;

public class ShopReader implements Reader<Shop> {

    @Override
    public Shop read() {
        ObjectMapper om = new ObjectMapper();
        try {
            Shop shop = om
                    .readValue(
                            new File(getClass().getResource("/data.json").toURI()),
                            Shop.class
                    );
            return shop;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
