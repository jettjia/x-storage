package org.apache.chemistry.opencmis.commons.impl.jaxb;

import java.math.BigInteger;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/", name = "RepositoryServicePort")
@XmlSeeAlso({ObjectFactory.class})
public interface RepositoryServicePort {
  @WebMethod(action = "getTypeChildren")
  @RequestWrapper(localName = "getTypeChildren", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetTypeChildren")
  @ResponseWrapper(localName = "getTypeChildrenResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetTypeChildrenResponse")
  @WebResult(name = "types", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisTypeDefinitionListType getTypeChildren(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "includePropertyDefinitions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean, @WebParam(name = "maxItems", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger1, @WebParam(name = "skipCount", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger2, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "updateType")
  @RequestWrapper(localName = "updateType", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.UpdateType")
  @ResponseWrapper(localName = "updateTypeResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.UpdateTypeResponse")
  void updateType(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString, @WebParam(mode = WebParam.Mode.INOUT, name = "type", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisTypeDefinitionType> paramHolder, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "deleteType")
  @RequestWrapper(localName = "deleteType", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.DeleteType")
  @ResponseWrapper(localName = "deleteTypeResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.DeleteTypeResponse")
  void deleteType(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(mode = WebParam.Mode.INOUT, name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisExtensionType> paramHolder) throws CmisException;
  
  @WebMethod(action = "createType")
  @RequestWrapper(localName = "createType", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CreateType")
  @ResponseWrapper(localName = "createTypeResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.CreateTypeResponse")
  void createType(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString, @WebParam(mode = WebParam.Mode.INOUT, name = "type", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Holder<CmisTypeDefinitionType> paramHolder, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "getTypeDescendants")
  @RequestWrapper(localName = "getTypeDescendants", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetTypeDescendants")
  @ResponseWrapper(localName = "getTypeDescendantsResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetTypeDescendantsResponse")
  @WebResult(name = "types", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  List<CmisTypeContainer> getTypeDescendants(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "depth", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") BigInteger paramBigInteger, @WebParam(name = "includePropertyDefinitions", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") Boolean paramBoolean, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "getRepositoryInfo")
  @RequestWrapper(localName = "getRepositoryInfo", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetRepositoryInfo")
  @ResponseWrapper(localName = "getRepositoryInfoResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetRepositoryInfoResponse")
  @WebResult(name = "repositoryInfo", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisRepositoryInfoType getRepositoryInfo(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "getTypeDefinition")
  @RequestWrapper(localName = "getTypeDefinition", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetTypeDefinition")
  @ResponseWrapper(localName = "getTypeDefinitionResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetTypeDefinitionResponse")
  @WebResult(name = "type", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  CmisTypeDefinitionType getTypeDefinition(@WebParam(name = "repositoryId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString1, @WebParam(name = "typeId", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") String paramString2, @WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
  
  @WebMethod(action = "getRepositories")
  @RequestWrapper(localName = "getRepositories", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetRepositories")
  @ResponseWrapper(localName = "getRepositoriesResponse", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/", className = "org.apache.chemistry.opencmis.commons.impl.jaxb.GetRepositoriesResponse")
  @WebResult(name = "repositories", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
  List<CmisRepositoryEntryType> getRepositories(@WebParam(name = "extension", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/") CmisExtensionType paramCmisExtensionType) throws CmisException;
}


/* Location:              E:\web\java_work\jd-gui-windows-1.6.6\chemistry-opencmis-commons-impl-1.1.0.jar!\org\apache\chemistry\opencmis\commons\impl\jaxb\RepositoryServicePort.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */