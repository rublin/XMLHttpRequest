package org.rublin.repository;

import org.rublin.model.CryptoCurrency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CryproCurrencyRepository {
    private ConcurrentHashMap<String, CryptoCurrency> bookMap = new ConcurrentHashMap<String, CryptoCurrency>();

    public CryptoCurrency get(String key) {
        return bookMap.get(key);
    }

    @PostConstruct
    private void init() {
        bookMap.put("KRB", new CryptoCurrency("KRB", "http://karbo.io", "Karbo(vanets)"));
        bookMap.put("BTC", new CryptoCurrency("BTC", "http://BTC.com", "Bitcoin"));
    }
}
