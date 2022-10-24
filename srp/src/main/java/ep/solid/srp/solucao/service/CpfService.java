package ep.solid.srp.solucao.service;

public class CpfService {
    public static boolean isValid(String cpf) {
        return cpf.length() == 11;
    }
}
