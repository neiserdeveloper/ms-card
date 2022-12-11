package com.crud.card.service;

import com.crud.card.model.Card;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICardService {
    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card);
    public int deleteById(int id);
}
