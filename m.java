package Java_Advanced.CodeGen;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

interface AlertDAO{
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);
    
}

class AlertService {
    private final AlertDAO storage;

    public AlertService(AlertDAO a){
        
        this.storage=a;

    }
		
    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }
	
    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }	
}

class MapAlertDAO implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();
	@Override
    public UUID addAlert(Date time) {
    	UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }
	@Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
    
}