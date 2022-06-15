package repository;

import model.MatBangDTO;

import java.util.List;

public interface IMatBangRepository {
    List<MatBangDTO> findMatBang();
}
