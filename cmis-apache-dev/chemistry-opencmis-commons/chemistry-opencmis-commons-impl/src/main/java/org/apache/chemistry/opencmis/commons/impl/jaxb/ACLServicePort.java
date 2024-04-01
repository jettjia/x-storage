package org.apache.chemistry.opencmis.commons.impl.jaxb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "ACLServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface ACLServicePort {
  @WebMethod(action = "getACL")
  @RequestWrapper(localName = "getACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetACL")
  @ResponseWrapper(localName = "getACLResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetACLResponse")
  @WebResult(name = "ACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisACLType getACL(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "onlyBasicPermissions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "applyACL")
  @RequestWrapper(localName = "applyACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.ApplyACL")
  @ResponseWrapper(localName = "applyACLResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.ApplyACLResponse")
  @WebResult(name = "ACL", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisACLType applyACL(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "objectId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "addACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisAccessControlListType paramCmisAccessControlListType1, @WebParam(name = "removeACEs", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisAccessControlListType paramCmisAccessControlListType2, @WebParam(name = "ACLPropagation", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") EnumACLPropagation paramEnumACLPropagation, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
}


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\ACLServicePort.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */