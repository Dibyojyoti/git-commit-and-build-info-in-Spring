import org.springframework.schedulling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.inject.Inject;

@Component
public class myScheduledTasks {
   @Inject
   private AppInfo appinfo;

   @Scheduled(fixedrate = 86400000)
   public void print() {
      appinfo.print();
   }
}
