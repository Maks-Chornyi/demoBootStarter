package io.cursor.lecture22.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private int id;
    private String bName;
    private String desc;
}
