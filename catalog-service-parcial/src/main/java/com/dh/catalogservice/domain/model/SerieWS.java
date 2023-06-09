package com.dh.catalogservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerieWS {

    private String id;
    private String name;
    private String genre;
    private List<SeasonWS> seasons;
}
