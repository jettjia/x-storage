package org.apache.chemistry.opencmis.commons.impl.jaxb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "MultiFilingServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface MultiFilingServicePort {
  @WebMethod(action = "addObjectToFolder")
  @RequestWrapper(localName = "addObjectToFolder", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.AddObjectToFolder")
  @ResponseWrapper(localName = "addObjectToFolderResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.AddObjectToFolderResponse")
  void addObjectToFolder(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "folderId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString3, @WebParam(name = "allVersions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean, @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisExtensionType> paramHolder) throws CmisException;
  
  @WebMethod(action = "removeObjectFromFolder")
  @RequestWrapper(localName = "removeObjectFromFolder", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.RemoveObjectFromFolder")
  @ResponseWrapper(localName = "removeObjectFromFolderResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.RemoveObjectFromFolderResponse")
  void removeObjectFromFolder(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "folderId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString3, @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisExtensionType> paramHolder) throws CmisException;
}


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\MultiFilingServicePort.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */