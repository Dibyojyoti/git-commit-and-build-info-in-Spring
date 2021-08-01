import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import javax.annotation.PostConstruct;

@Configuration
@PropertySources({@PropertySource("classpath:git.properties")}) 
public class AppInfo {

  @Value("${git.commit.id}")
  private String commitId;

  @Value("${git.build.time}")
  private String buildTime;

  @PostConstruct
  public void init() { 
      print();
  }

  public void print() {
logger.info(“commitId {}”,commitId);
logger.info(“buildTime {}”,buildTime);  
  }
}  
