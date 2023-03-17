package campus.apikit4;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ZoneDtoWeb(
        @Digits(integer = 10, fraction = 0) Integer id,
        @Size(max=5) @NotBlank String label,
        @Max(100) @Digits(integer = 5, fraction = 0) Integer parent_zone_id  ){
}