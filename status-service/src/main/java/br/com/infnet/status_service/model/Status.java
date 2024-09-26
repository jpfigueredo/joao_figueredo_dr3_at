package br.com.infnet.status_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Status {
    Long id;
    boolean onOff;
    Long veiculoID;
}
