package com.example.kampai.resources;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class SaveTragoResource {
    @NotNull
    @NotBlank
    @Size(max = 100)
    public String name;
    @NotNull
    @NotBlank
    @Size(max = 100)
    public int price;
    @NotNull
    @NotBlank
    @Size(max = 100)
    public String description;
}
