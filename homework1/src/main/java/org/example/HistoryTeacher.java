package org.example;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HistoryTeacher extends Teacher{
    protected String field_of_professions;

    public HistoryTeacher(String name, int id_number, String field_of_professions) {
        super(name, id_number);
        this.field_of_professions = field_of_professions;
    }
}
