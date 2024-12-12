package com.example.demo.pkg;

import java.io.Serializable;

public record Pojo(
        String first,
        String second) implements Serializable {
}
