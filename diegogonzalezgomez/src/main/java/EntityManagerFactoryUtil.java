import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

    private static volatile EntityManagerFactory instance;

    private EntityManagerFactoryUtil() {
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if (instance == null) {
            synchronized (EntityManagerFactoryUtil.class) {
                if (instance == null) {
                    instance = Persistence.createEntityManagerFactory("NBA_PU");
                }
            }
        }
        return instance;
    }

    public static void closeEntityManagerFactory() {
        if (instance != null && instance.isOpen()) {
            instance.close();
        }
    }
}
