package com.example.publicHousing.domain.house.model.response;

import com.example.publicHousing.common.exception.ResultCode;
import com.example.publicHousing.domain.house.model.HousingInfo;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Housing Info")
public record HousingInfoResponse(
        @Schema(description = "Result Code")
        ResultCode code,

        @Schema(description = "Detail Information")
        HousingInfo housingInfo
) {
}
