package org.apache.chemistry.opencmis.commons.impl.jaxb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "VersioningServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface VersioningServicePort {
  @WebMethod(action = "checkOut")
  @RequestWrapper(localName = "checkOut", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CheckOut")
  @ResponseWrapper(localName = "checkOutResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CheckOutResponse")
  void checkOut(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString, @WebParam(mode = WebParam.Mode.INOUT, name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<String> paramHolder, @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisExtensionType> paramHolder1, @WebParam(mode = WebParam.Mode.OUT, name = "contentCopied", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<Boolean> paramHolder2) throws CmisException;
  
  @WebMethod(action = "cancelCheckOut")
  @RequestWrapper(localName = "cancelCheckOut", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CancelCheckOut")
  @ResponseWrapper(localName = "cancelCheckOutResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CancelCheckOutResponse")
  void cancelCheckOut(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisExtensionType> paramHolder) throws CmisException;
  
  @WebMethod(action = "getObjectOfLatestVersion")
  @RequestWrapper(localName = "getObjectOfLatestVersion", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetObjectOfLatestVersion")
  @ResponseWrapper(localName = "getObjectOfLatestVersionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetObjectOfLatestVersionResponse")
  @WebResult(name = "object", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisObjectType getObjectOfLatestVersion(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean1, @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString3, @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean2, @WebParam(name = "includeRelationships", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") EnumIncludeRelationships paramEnumIncludeRelationships, @WebParam(name = "renditionFilter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString4, @WebParam(name = "includePolicyIds", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean3, @WebParam(name = "includeACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean4, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "getAllVersions")
  @RequestWrapper(localName = "getAllVersions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetAllVersions")
  @ResponseWrapper(localName = "getAllVersionsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetAllVersionsResponse")
  @WebResult(name = "objects", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  List<CmisObjectType> getAllVersions(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString3, @WebParam(name = "includeAllowableActions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "getPropertiesOfLatestVersion")
  @RequestWrapper(localName = "getPropertiesOfLatestVersion", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetPropertiesOfLatestVersion")
  @ResponseWrapper(localName = "getPropertiesOfLatestVersionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetPropertiesOfLatestVersionResponse")
  @WebResult(name = "properties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisPropertiesType getPropertiesOfLatestVersion(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean, @WebParam(name = "filter", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString3, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "checkIn")
  @RequestWrapper(localName = "checkIn", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CheckIn")
  @ResponseWrapper(localName = "checkInResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CheckInResponse")
  void checkIn(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(mode = WebParam.Mode.INOUT, name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<String> paramHolder, @WebParam(name = "major", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean, @WebParam(name = "properties", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisPropertiesType paramCmisPropertiesType, @WebParam(name = "contentStream", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisContentStreamType paramCmisContentStreamType, @WebParam(name = "checkinComment", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "policies", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") List<String> paramList, @WebParam(name = "addACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisAccessControlListType paramCmisAccessControlListType1, @WebParam(name = "removeACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisAccessControlListType paramCmisAccessControlListType2, @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisExtensionType> paramHolder1) throws CmisException;
}


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\VersioningServicePort.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */