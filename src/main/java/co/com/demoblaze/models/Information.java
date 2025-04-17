package co.com.demoblaze.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Information {

    private String category;
    private String Product;
    private String Price;
    private String Description;
}
