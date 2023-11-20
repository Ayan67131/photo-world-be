package com.photocompetition.photocompetition.service;

import com.photocompetition.photocompetition.dto.ContestDto;
import com.photocompetition.photocompetition.mapper.ContestMapper;
import com.photocompetition.photocompetition.repository.ContestRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;


@Service
@AllArgsConstructor
public class ContestService {

    private ContestRepository contestRepository;
    private ContestMapper contestMapper;

    public List<ContestDto> fetchAll() {
        List<ContestDto> contestDtoList = contestRepository.findAll()
                .stream().map(contestMapper::entityToDto).toList();
        contestDtoList.forEach(i -> i.setRemainingDays(DAYS.between(LocalDate.now(),i.getEndDate())));
        return contestDtoList;
    }

    public void save(ContestDto contestDto) {
        contestRepository.save(contestMapper.dtoToEntity(contestDto));
    }

    public ContestDto fetchContestById(int id) {
        ContestDto contestDto= contestMapper.entityToDto(
                contestRepository.findById(id).orElseThrow(
                        () -> new EntityNotFoundException("User Not Found")));
        contestDto.setRemainingDays(DAYS.between(LocalDate.now(),contestDto.getEndDate()));
        return contestDto;
    }
}
