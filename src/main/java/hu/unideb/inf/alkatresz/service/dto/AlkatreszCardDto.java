package hu.unideb.inf.alkatresz.service.dto;

import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class AlkatreszCardDto {
    private Long id;
    private String nev;
    private String tipus;
    private String meret;
    private String gyarto;
}
