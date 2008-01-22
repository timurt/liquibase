package liquibase.migrator;

import liquibase.database.Database;
import liquibase.exception.JDBCException;

public interface UIFacade {

    boolean promptForNonLocalDatabase(Database database) throws JDBCException;
}
