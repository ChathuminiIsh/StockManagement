package com.example.stockmanagement.Supplier;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SupplierDTO {

    @JsonProperty("supplier_name")
    private String supplierName;

    @JsonProperty("contact_name")
    private String contactName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("contact_information")
    private String contactInformation;

    @JsonProperty("address")
    private String address;

    @JsonProperty("created_at")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm")
    private LocalDateTime updatedAt;

}
