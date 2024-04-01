package org.apache.chemistry.opencmis.commons.impl.jaxb;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "RelationshipServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface RelationshipServicePort {
  @WebMethod(action = "getObjectRelationships")
  @RequestWrapper(localName = "getObjectRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetObjectRelationships")
  @ResponseWrapper(localName = "getObjectRelationshipsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetObjectRelationshipsResponse")
  @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisObjectListType getObjectRelationships(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "includeSubRelationshipTypes", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean1, @WebParam(name = "relationshipDirection", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") EnumRelationshipDirection paramEnumRelationshipDirection, @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString3, @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString4, @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean2, @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger1, @WebParam(name = "skipCount", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger2, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
}


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\RelationshipServicePort.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */