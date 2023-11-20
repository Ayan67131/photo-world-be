package com.photocompetition.photocompetition.mapper;

import com.photocompetition.photocompetition.dto.ContestDto;
import com.photocompetition.photocompetition.entity.Contest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContestMapper {
    Contest dtoToEntity(ContestDto contestDto);
    ContestDto entityToDto(Contest contest);
}
