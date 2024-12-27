package org.example.models;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String name;
    private String author;
    private String isbn;
    private float price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
