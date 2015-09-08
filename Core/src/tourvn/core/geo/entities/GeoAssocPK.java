package tourvn.core.geo.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: NGUYEN VAN NHAN
 * Date: 5/31/2015
 * Time: 10:24 PM
 * Media Group
 * To change this template use File | Settings | File Templates.
 */
public class GeoAssocPK implements Serializable {
    private String geoId;
    private String geoIdTo;

    @Column(name = "GEO_ID", nullable = false, insertable = true, updatable = true, length = 20)
    @Id
    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    @Column(name = "GEO_ID_TO", nullable = false, insertable = true, updatable = true, length = 20)
    @Id
    public String getGeoIdTo() {
        return geoIdTo;
    }

    public void setGeoIdTo(String geoIdTo) {
        this.geoIdTo = geoIdTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeoAssocPK that = (GeoAssocPK) o;

        if (geoId != null ? !geoId.equals(that.geoId) : that.geoId != null) return false;
        if (geoIdTo != null ? !geoIdTo.equals(that.geoIdTo) : that.geoIdTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = geoId != null ? geoId.hashCode() : 0;
        result = 31 * result + (geoIdTo != null ? geoIdTo.hashCode() : 0);
        return result;
    }
}
