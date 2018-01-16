package org.rublin;

import org.rublin.model.CryptoCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.rublin.repository.CryproCurrencyRepository;

@RestController
public class CryptoCurrencyController {

    @Autowired
    private CryproCurrencyRepository cryproCurrencyRepository;

    @RequestMapping(value = "/currency", method = RequestMethod.GET)
    public CryptoCurrency getById(@RequestParam("id") String id) {
        return cryproCurrencyRepository.get(id);
    }
}
