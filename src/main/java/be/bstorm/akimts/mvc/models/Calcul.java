package be.bstorm.akimts.mvc.models;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class Calcul {

    @Positive
    private int nb1,nb2;
    private char op;
}
