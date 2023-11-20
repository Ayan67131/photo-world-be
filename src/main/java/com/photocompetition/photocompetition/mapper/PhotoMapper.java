package com.photocompetition.photocompetition.mapper;

import com.photocompetition.photocompetition.dto.ContestDto;
import com.photocompetition.photocompetition.dto.PhotoDto;
import com.photocompetition.photocompetition.entity.Contest;
import com.photocompetition.photocompetition.entity.Photo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhotoMapper {
    Photo dtoToEntity(PhotoDto contestDto);
    PhotoDto entityToDto(Photo contest);
}
