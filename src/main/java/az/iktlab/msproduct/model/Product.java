package az.iktlab.msproduct.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;
    private LocalDate year;
    private Model model;
    private Kind kind;
    private BigDecimal price;
}
