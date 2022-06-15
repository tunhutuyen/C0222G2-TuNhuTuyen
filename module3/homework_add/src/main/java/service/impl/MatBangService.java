package service.impl;

import model.MatBangDTO;
import repository.IMatBangRepository;
import repository.impl.MatBangRepository;
import service.IMatBangService;

import java.util.List;

public class MatBangService implements IMatBangService {
    private IMatBangRepository iMatBangRepository = new MatBangRepository();
    @Override
    public List<MatBangDTO> findMatBang() {
        return iMatBangRepository.findMatBang();
    }
}
