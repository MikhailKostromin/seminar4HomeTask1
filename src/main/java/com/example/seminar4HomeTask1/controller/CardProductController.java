package com.example.seminar4HomeTask1.controller;

import com.example.seminar4HomeTask1.model.CardProduct;
import com.example.seminar4HomeTask1.services.CardProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/cardProducts") // Defines a base URI for all request mappings within this controller
@AllArgsConstructor
public class CardProductController {
    /**
     * Сервис для работы с объектами карточек товара.
     */
    private final CardProductService cardProductService;

    /**
     * Эндпоинт карточек товара.
     *
     * @param model модель для передачи данных в представление.
     * @return странцу со всевми карточками товара.
     */
    @GetMapping
    public String getCardProducts(Model model) {
        model.addAttribute("cardProducts", cardProductService.getAllCardProducts());
        return "cardProducts";
    }

    /**
     * Эндпоинт формы представления карточки товара.
     * @param cp объект новой карточки товара с заполненными полями.
     * @param model объект Model, используемый для передачи атрибутов между контроллером и представлением.
     * @return строка с именем представления (view), к которому будет перенаправлен пользователь.
     */
    @PostMapping
    public String addCardProduct(CardProduct cp, Model model){
        cardProductService.addCardProduct(cp);
        model.addAttribute("cardProducts", cardProductService.getAllCardProducts());
        return "cardProducts";
    }
}
