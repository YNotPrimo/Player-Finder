package football.service.impl;

import football.service.StatService;
import org.springframework.stereotype.Service;

@Service
public class StatServiceImpl implements StatService {
    @Override
    public boolean areImported() {
        return false;
    }

    @Override
    public String readStatsFileContent()  {
        return null;
    }

    @Override
    public String importStats() {
        return null;
    }
}