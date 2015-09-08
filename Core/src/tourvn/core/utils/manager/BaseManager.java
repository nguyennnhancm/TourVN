package tourvn.core.utils.manager;

import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 6/2/2015
 * Time: 4:48 PM
 * Long Van Soft Solution JSC
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseManager{
    protected Logger logger = Logger.getLogger(getClass());
    @PersistenceContext(unitName="TourVN")
    EntityManager entityManager;

    public BaseManager() {

    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    protected void persist(Object paramObject) {
        this.entityManager.persist(paramObject);
    }

    protected <T> T merge(T paramT) {
        return this.entityManager.merge(paramT);
    }

    protected void remove(Object paramObject) {
        this.entityManager.remove(paramObject);
    }

    protected <T> T find(Class<T> entityClass, Object primaryKey) {
        return this.entityManager.find(entityClass, primaryKey);
    }

    protected <T> List<T> findAll(Class<T> entityClass) {
        CriteriaQuery cq = this.entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return this.entityManager.createQuery(cq).getResultList();
    }
}
