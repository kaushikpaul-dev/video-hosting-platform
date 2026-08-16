package com.kaushik.videohosting.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UploadVideoRequest {

    @NotBlank
    private String title;

    private String description;
}
