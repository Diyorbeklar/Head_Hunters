package com.example.headhunters.mapper;

import java.util.List;

public interface EntityMapper <D,E>{
    D toDTO(E e);
    E toEntity(D d);
    List<D> toDTOs(List<E> es);
    List<E> toEntitys(List<D> ds);

}
