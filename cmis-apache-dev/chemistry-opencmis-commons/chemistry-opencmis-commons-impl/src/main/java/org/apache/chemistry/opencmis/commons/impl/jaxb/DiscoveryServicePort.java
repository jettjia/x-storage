package org.apache.chemistry.opencmis.commons.impl.jaxb;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "DiscoveryServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface DiscoveryServicePort {
  @WebMethod(action = "query")
  @RequestWrapper(localName = "query", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.Query")
  @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.QueryResponse")
  @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisObjectListType query(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "statement", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "searchAllVersions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean1, @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean2, @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") EnumIncludeRelationships paramEnumIncludeRelationships, @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString3, @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger1, @WebParam(name = "skipCount", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger2, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "getContentChanges")
  @RequestWrapper(localName = "getContentChanges", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetContentChanges")
  @ResponseWrapper(localName = "getContentChangesResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetContentChangesResponse")
  void getContentChanges(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(mode = WebParam.Mode.INOUT, name = "changeLogToken", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<String> paramHolder, @WebParam(name = "includeProperties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean1, @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "includePolicyIds", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean2, @WebParam(name = "includeACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean3, @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType, @WebParam(mode = WebParam.Mode.OUT, name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisObjectListType> paramHolder1) throws CmisException;
}


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\DiscoveryServicePort.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */