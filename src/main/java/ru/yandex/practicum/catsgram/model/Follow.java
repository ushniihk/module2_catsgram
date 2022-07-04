package ru.yandex.practicum.catsgram.model;

import lombok.Data;


@Data
public class Follow {
    private final String author;
    private final String follower;
}
