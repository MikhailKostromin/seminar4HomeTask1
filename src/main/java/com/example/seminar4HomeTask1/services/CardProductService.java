package com.example.seminar4HomeTask1.services;

import com.example.seminar4HomeTask1.model.CardProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис осуществляющий работу с карточками товара.
 */

@Service
public class CardProductService {

    List<CardProduct> cardProducts = new ArrayList<>();

    /**
     * Создание новой карточки товара.
     * @param cardProduct объект карточки товара
     */
    public void addCardProduct(CardProduct cardProduct) {
        cardProducts.add(cardProduct);
    }

    /**
     * Получение всех карточек товара.
     * @return список карточек товара.
     */
    public List<CardProduct> getAllCardProducts() {
        return cardProducts;
    }


}
