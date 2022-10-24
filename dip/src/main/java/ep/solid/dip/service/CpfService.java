package ep.solid.dip.service;

import ep.solid.dip.service.interfaces.ICpfService;
import org.springframework.stereotype.Service;

@Service
public class CpfService implements ICpfService {
    @Override
    public boolean isValid(String cpf) {
        return cpf.length() == 11;
    }
}
