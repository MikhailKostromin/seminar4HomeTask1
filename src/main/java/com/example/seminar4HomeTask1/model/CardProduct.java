package com.example.seminar4HomeTask1.model;

import lombok.Data;
/**
 * Сущность карточки товара.
 */
@Data
public class CardProduct {
    /**
     * Наименование товара.
     */
    private String name;

    /**
     * Артикул товара.
     */
    private int article;

    /**
     * Описание товара.
     */
    private String description;
    /**
     * Стоимость товара.
     */
    private double price;

}
