package az.iktlab.msproduct.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdsDto {

    private Long id;
    private String name;
    private String description;
    private String image;
}
